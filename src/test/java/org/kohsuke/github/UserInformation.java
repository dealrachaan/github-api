package org.kohsuke.github;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import com.infradna.tool.bridge_method_injector.WithBridgeMethods;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Date;

public class UserInformation implements GHMyself {

    //from GHMyself.java
    GHMyself myself = new GHMyself();
    List<String> userEmails = myself.getEmails();
    List<GHEmail> userEmails2 = myself.getEmails2();
    List<GHKey> userPublicKeys = myself.getPublicKeys();
    List<GHVerifiedKey> userVerifiedKeys = myself.getPublicVerifiedKeys();
    GHPersonSet<GHOrganization> userOrganizations = myself.getAllOrganizations();
    Map<String,GHRepository> userOwnedRepositories = myself.getAllRepositories();
    PagedIterable<GHRepository> userOwnedRepositoryList = myself.listRepositories();
    PagedIterable<GHMembership> userOrgMemberships = myself.listOrgMemberships();
    
    //fromGHUser.java
    PagedIterable<GHUser> userFollowingList = myself.listFollows();
    PagedIterable<GHUser> userFollowersList = myself.listFollowers();
    PagedIterable<GHRepository> userSubscribedRepositories = myself.listSubscriptions();
    PagedIterable<GHRepository> userStarredRepositories = myself.listStarredRepositories();
    PagedIterable<GHEventInfo> userEvents = myself.listEvents();
    PagedIterable<GHGist> userGists = myself.listGists();
    
    //functions to print these values
    public void printFollowingList(PagedIterable<GHUser> userFollowingList){
     int i=0;
     System.out.println("User follows:");
     for (GHUser following : userFollowingList){
         System.out.println(following.getName()+"; ");
         i++;
         if(i==10){
             System.out.print(" ");
             i=0;
         }
     }
    }
    
    public void printFollowersList(PagedIterable<GHUser> userFollowersList){
     int i=0;
     System.out.println("Follwers of user:");   
     for (GHUser follower : userFollowingList){
         System.out.println(follower.getName()+"; ");
         i++;
         if(i==10){
             System.out.print(" ");
             i=0;
         }
     }
    }
    
    public void printSubscribedRepositories(PagedIterable<GHRepository> userSubscribedRepositories){
     int i=0;
     System.out.println("Subscribed Repositories:");   
     for (GHRepository subRepo : userSubscribedRepositories){
         System.out.println(subRepo.getFullName()+"; ");
         i++;
         if(i==10){
             System.out.print(" ");
             i=0;
         }
     }
    }
    
    public void printStarredRepositories(PagedIterable<GHRepository> userStarredRepositories){
     int i=0;
     System.out.println("Starred Repositories:");   
     for (GHRepository starRepo : userStarredRepositories){
         System.out.print(starRepo.getFullName()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printUserEvents(PagedIterable<GHEventInfo> userEvents){ //only returns event ID as github doesn't provide event names in API now
     int i=0;
     System.out.println("User Events:");   
     for (GHEventInfo event : userEvents){
         System.out.print(event.getId()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printUserGists(PagedIterable<GHGist> userGists){
     System.out.println("User Gists:");   
     for (GHGist gist : userGists){
         System.out.println(gist.getForksUrl()+"; ");
     }
    }
    
    //from GHPerson.java
    String userGravatarId = myself.getGravatarId();
    String userAvatarUrl = myself.getAvatarUrl();
    String userLogin = myself.getLogin();
    String userName = myself.getName();
    String userCompany = myself.getCompany();
    String userLocation = myself.getLocation();
    String userCreatedAt = myself.getCreatedAt();
    String userUpdatedAt = myself.getUpdatedAt();
    String userBlog = myself.getBlog();
    String userHtmlUrl = myself.getHtmlUrl();
    String userEmail = myself.getEmail;
    String userPublicGistCount = myself.getPublicGistCount;
    String userPublicRepoCount = myself.getPublicRepoCount;
    String userFollowingCount = myself.getFollowingCount;
    String userFollowersCount = myself.getFollowersCount;
    
    //Output
    System.print.ln("Gravatar ID: "+userGravatarId);
    System.print.ln("Avatar URL: "+userAvatarUrl);
    System.print.ln("Login: "+userLogin);
    System.print.ln("Name: "+userName);
    System.print.ln("Company: "+userCompany);
    System.print.ln("Location: "+userLocation);
    System.print.ln("Created at: "+userCreatedAt);
    System.print.ln("Updated at: "+userUpdatedAt);
    System.print.ln("Blog: "+userBlog);
    System.print.ln("HTML URL: "+userHtmlUrl);
    System.print.ln("Email: "+userEmail);
    System.print.ln("Gist Count: "+userPublicGistCount);
    System.print.ln("Repository count: "+userPublicRepoCount);
    System.print.ln("User follows "+userFollowingCount+" people");
    System.print.ln("User has "+userFollowersCount+" followers);
    
    printFollowingList(userFollowingList);
    printFollowersList(userFollowersList);
    printSubscribedRepositories(userSubscribedRepositories);
    printStarredRepositories(userStarredRepositories);
    printUserEvents(userEvents);
    printUserGists(userGists);





