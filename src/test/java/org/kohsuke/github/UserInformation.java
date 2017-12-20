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
    GHUser myself = new GHMyself();
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
    GHPersonSet<GHUser> userFollowersList = myself.listFollowers();
    PagedIterable<GHRepository> userSubscribedRepositories = myself.listSubscriptions();
    PagedIterable<GHRepository> userStarredRepositories = myself.listStarredRepositories();
    boolean userIsOrgMember(GHOrganization org){
        return myself.isMemberOf(org);
    }
    boolean userIsTeamMember(GHTeam team){
        return myself.isMemberOf(team);
    }
    boolean userIsPublicMemberOf(GHOrganization org){
        return myself.isPublicMemberOf(org);
    }
    PagedIterable<GHEventInfo> userEvents = myself.listEvents();
    PagedIterable<GHGist> userGists = myself.listGists();
    
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
