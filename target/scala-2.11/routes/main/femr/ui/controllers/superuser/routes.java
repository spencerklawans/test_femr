// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/spencerklawans/Documents/newfemr/conf/routes
// @DATE:Wed Feb 17 23:54:59 PST 2021

package femr.ui.controllers.superuser;

import router.RoutesPrefix;

public class routes {
  
  public static final femr.ui.controllers.superuser.ReverseSuperuserController SuperuserController = new femr.ui.controllers.superuser.ReverseSuperuserController(RoutesPrefix.byNamePrefix());
  public static final femr.ui.controllers.superuser.ReverseTabController TabController = new femr.ui.controllers.superuser.ReverseTabController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final femr.ui.controllers.superuser.javascript.ReverseSuperuserController SuperuserController = new femr.ui.controllers.superuser.javascript.ReverseSuperuserController(RoutesPrefix.byNamePrefix());
    public static final femr.ui.controllers.superuser.javascript.ReverseTabController TabController = new femr.ui.controllers.superuser.javascript.ReverseTabController(RoutesPrefix.byNamePrefix());
  }

}
