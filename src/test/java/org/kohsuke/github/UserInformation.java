package org.kohsuke.github;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

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

public class UserInformation implements GHMyself {

    //from GHMyself.java
    GHUser user = new GHUser();
    List<String> userEmails = new List<String>();
    List<GHEmail> userEmails2 = new List<GHEmail>();
    List<GHKey> userKeys = new List<UserKeys>();
    List<GHVerifiedKey> userVerifiedKeys = new List<GHVerifiedKey>();
    GHPersonSet<GHOrganization> userOrganizations = new GHPersonSet<GHOrganization>();
    Map<String,GHRepository> userOwnedRepositories = new Map<String,GHRepository>();
    PagedIterable<GHRepository> userOwnedRepositoryList = new PagedIterable<GHRepository>();
    PagedIterable<GHMembership> userOrgMemberships = new PagedIterable<GHMembership>();
    
    //fromGHUser.java
    PagedIterable<GHUser> userFollowingList = new PagedIterable<GHUser>();
    GHPersonSet<GHUser> userFollowersList = new GHPersonSet<GHUser>();
    PagedIterable<GHRepository> userFollowedRepositories = new PagedIterable<GHRepository>();
    PagedIterable<GHRepository> userStarredRepositories = new PagedIterable<GHRepository>();
    boolean userIsOrgMember(GHOrganization);
    boolean userIsTeamMember(GHTeam);
    boolean userIsPublicMemberOf(GHOrganization);
    PagedIterable<GHEventInfo> userEvents = new PagedIterable<GHEventInfo>();
    PagedIterable<GHGist> userGists = new PagedIterable<GHGist> listGists();
