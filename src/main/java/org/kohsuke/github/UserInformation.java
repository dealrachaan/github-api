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
    
    //functions to print these values
     public void printEmails(List<String> userEmails){
     int i=0;
     System.out.println("User emails:");
     for (String email : userEmails){
         System.out.print(email+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printEmails2(List<GHEmail> userEmails2){
     int i=0;
     System.out.println("User emails:");
     for (String email : userEmails2){
         System.out.print(email.getEmail()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printPublicKeys(List<GHKey> userPublicKeys){
     int i=0;
     System.out.println("User's public keys:");
     for (String pubKey : userPublicKeys){
         System.out.print(pubKey.getTitle()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printVerifiedKeys(List<GHVerifiedKey> userVerifiedKeys){
     int i=0;
     System.out.println("User's verified keys:");
     for (String verKey : userVerifiedKeys){
         System.out.print(verKey.getTitle()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printOrganizations(GHPersonSet<GHOrganization> userOrganizations){
     int i=0;
     System.out.println("User's verified keys:");
     for (String org : userOrganizations){
         System.out.print(org.getName()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printUserOwnedRepositories(Map<String,GHRepository> userOwnedRepositories){
     int i=0;
     System.out.println("User's verified keys:");
     for (GHRepository ownedRep : userOwnedRepositories) {
         System.out.print(ownedRep.getFulName()"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printUserOwnedRepositriesList(PagedIterable<GHRepository> userOwnedRepositoryList){
     int i=0;
     System.out.println("User's owned repositories:");
     for (GHRepository ownedRepL : userOwnedRepositoryList) {
         System.out.print(ownedRepL.getFullName()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printOrgMemberships(PagedIterable<GHMembership> userOrgMemberships){
     System.out.println("Organisations user is a member of:");
     for (GHMembership org : userOrgMemberships) {
         System.out.println(org.getUrl()+";");
     }
    }
    
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
         System.out.print(following.getName()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printFollowersList(PagedIterable<GHUser> userFollowersList){
     int i=0;
     System.out.println("Follwers of user:");   
     for (GHUser follower : userFollowingList){
         System.out.print(follower.getName()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
             i=0;
         }
     }
    }
    
    public void printSubscribedRepositories(PagedIterable<GHRepository> userSubscribedRepositories){
     int i=0;
     System.out.println("Subscribed Repositories:");   
     for (GHRepository subRepo : userSubscribedRepositories){
         System.out.print(subRepo.getFullName()+"; ");
         i++;
         if(i==10){
             System.out.println(" ");
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
}

    public void printPersonInfo(GHMyself myself){
        System.print.ln("Gravatar ID: "+myself.userGravatarId);
        System.print.ln("Avatar URL: "+myself.userAvatarUrl);
        System.print.ln("Login: "+myself.userLogin);
        System.print.ln("Name: "+myself.userName);
        System.print.ln("Company: "+myself.userCompany);
        System.print.ln("Location: "+myself.userLocation);
        System.print.ln("Created at: "+myself.userCreatedAt);
        System.print.ln("Updated at: "+myself.userUpdatedAt);
        System.print.ln("Blog: "+myself.userBlog);
        System.print.ln("HTML URL: "+myself.userHtmlUrl);
        System.print.ln("Email: "+myself.userEmail);
        System.print.ln("Gist Count: "+myself.userPublicGistCount);
        System.print.ln("Repository count: "+myself.userPublicRepoCount);
        System.print.ln("User follows "+myself.userFollowingCount+" people");
        System.print.ln("User has "+myself.userFollowersCount+" followers);
    }
    
    public void printUserInfo(GHMyself myself){
        myself.printFollowingList(userFollowingList);
        myself.printFollowersList(userFollowersList);
        myself.printSubscribedRepositories(userSubscribedRepositories);
        myself.printStarredRepositories(userStarredRepositories);
        myself.printUserEvents(userEvents);
        myself.printUserGists(userGists);
    }
                        
    public void printMyselfInfo(GHMyself myself){
        myself.printEmails(userEmails);
        myself.printEmails2(userEmails2);
        myself.printPublicKeys(userPublicKeys);
        myself.printVerifiedKeys(userVerifiedKeys);
        myself.printOrganizations(userOrganizations);
        myself.printUserOwnedRepositories(userOwnedRepositories);
        myself.printUserOwnedRepositriesList(userOwnedRepositoryList);
        myself.printOrgMemberships(userOrgMemberships);
    }
    
    public void printAll(GHMyself myself){
        printPersonInfo(myself);
        printUserInfo(myself);
        printMyselfInfo(myself);
    }
}
     
