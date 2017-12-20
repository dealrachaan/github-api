package org.kohsuke.github;

import java.awt.*;
import java.io.IOException;
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


public class UserInformation implements GHMyself {


    GHUser user = new GHUser();
    List<String> userEmails = new List<String>();
    List<GHEmail> userEmails2 = new List<GHEmail>;
    List<GHKey> userKeys = new List<UserKeys>;
    List<GHVerifiedKey> userVerifiedKeys = new List<GHVerifiedKey>;
    GHPersonSet<GHOrganization> userOrganisations = new GHPersonSet<GHOrganization>;
    Map<String,GHRepository> userRepositories = new Map<String,GHRepository>;
    PagedIterable<GHRepository> userRepositoryList = new PagedIterable<GHRepository>;
    PagedIterable<GHMembership> userOrgMemberships = new PagedIterable<GHMembership>;
    
    
