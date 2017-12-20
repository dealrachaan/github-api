package org.kohsuke.github;

import java.awt.*;
import java.text.ParseException;

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
    String userGravatarId;
    String userAvatarUrl;
    String userLogIn;
    String userName;
    String userCompany;
    String userLocation;
    String userCreatedAt;
    String userUpdatedAt;
    String userBlog;
    String userHtmlUrl;
    String userEmail;
    String userPublicGistCount;
    String userPublicRepoCount;
    String userFollowingCount;
    String userFollowersCount;
