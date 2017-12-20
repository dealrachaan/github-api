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

<script src="https://d3js.org/d3-collection.v1.min.js"></script>

public class UserInfoAndGraphics(UserInformation myself){
     
     public void addUserOrganizations(GHUser user){
          GHPersonSet<GHOrganization> thisUsersOrgs = user.getOrgs();
          for (GHOrganization org : thisUsersOrgs) {
               boolean newOrg = allOrgs.add(org);
               if(newOrg){
                    //if this is a newly introduced org, create new visual node for this org + connect it to user
                    map.set(org, org.getName());
                    link({
                      source: [map.get(user.userName)],
                      target: [map.get(org.getName())]
                    });
                    //add this orgs users to the graph
                    addOrgUsers(org);
               }else{
                    //if not, link user to existing org
                    link({
                      source: [map.get(user.userName)],
                      target: [map.get(org.getName())]
                    });
               }
          }
     }
     
     public void addOrgUsers(GHOrganization org){
          PagedIterable<GHUser> thisOrgsUsers = org.getMembers();
          for (GHUser user : thisOrgsUsers) {
               boolean newUser = allMembers.add(user);
               if(newUser){
                    //if this is a newly introduced org, create new visual node for this org
                    map.set(user, user.userName);
                    link({
                      source: [map.get(org.getName())],
                      target: [map.get(user.userName)]
                    });
                    //add this users orgs to the graph
                    addUserOrganizations(user);
               }else{
                    //if not, link org to existing member
                    map.set(user, user.userName);
                    link({
                      source: [map.get(org.getName())],
                      target: [map.get(user.userName)]
                    });
               }
          }
     }
}

public static void main (String args[]){
     //returns text info on logged in user
     UserInformation myself = new UserInformation();
     printAll(myself); 
     //returns graphic depicting all organizations logged in user is member of, and all members of those organizations, by connecting map nodes depicting users to map nodes depicting orgs, without reduplicating nodes
     <script>
     GHPersonSet<GHOrganization> allOrgs = new GHPersonSet<GHOrganization>();
     GHPersonSet<GHUser> allMembers = new GHPersonSet<GHUser>;
     allMembers.add(myself);
     
     var map = d3.map().set(myself, myself.userName);

     addUserOrganizations(myself);
     </script>
}
