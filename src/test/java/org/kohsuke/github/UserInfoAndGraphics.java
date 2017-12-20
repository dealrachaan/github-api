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


public class UserInfoAndGraphics(UserInformation myself){
     
     GHPersonSet<GHOrganization> allOrgs = new GHPersonSet<GHOrganization>();
     GHPersonSet<GHUser> allMembers = new GHPersonSet<GHUser>;
     
     public void addUserOrganizations(GHUser user){
          GHPersonSet<GHOrganization> thisUsersOrgs = user.getOrgs();
          for (GHOrganization org : thisUsersOrgs) {
               boolean newOrg = allOrgs.add(org);
               if(newOrg){
                    //if this is a newly introduced org, create new visual node for this org
                    //add this orgs users to the graph
                    addOrgUsers(org);
               }else{
                    //if not, link it to existing member nodes of this org
               }
          }
     }
     
     public void addOrgUsers(GHOrganization org){
          PagedIterable<GHUser> thisOrgsUsers = org.getMembers();
          for (GHUser user : thisOrgsUsers) {
               boolean newUser = allMembers.add(user);
               if(newUser){
                    //if this is a newly introduced org, create new visual node for this org
                    //add this users orgs to the graph
                    addUserOrganizations(user);
               }else{
                    //if not, link it to existing user nodes for this member
               }
          }
     }
}

public static void main (String args[]){
     //returns text info on logged in user
     UserInformation myself = new UserInformation();
     printAll(myself); 
     //returns graphic depicting all organizations logged in user is member of, and all members of those organizations
     allMembers.add(myself);
     addUserOrganizations(myself);
}
