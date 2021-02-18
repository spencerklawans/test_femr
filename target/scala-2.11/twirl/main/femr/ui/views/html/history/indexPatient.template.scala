
package femr.ui.views.html.history

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object indexPatient extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[femr.common.dtos.CurrentUser,java.lang.Boolean,femr.ui.models.history.IndexPatientViewModelGet,List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: femr.common.models.PatientEncounterItem
},AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, searchError: java.lang.Boolean, viewModel: femr.ui.models.history.IndexPatientViewModelGet, patientEncounters: List[_ <: femr.common.models.PatientEncounterItem], assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import femr.ui.views.html.layouts.main
/*4.2*/import femr.ui.views.html.partials.search
/*5.2*/import femr.ui.controllers.routes.MedicalController
/*6.2*/import femr.ui.controllers.routes.PharmaciesController
/*7.2*/import femr.ui.controllers.routes.TriageController
/*8.2*/import femr.ui.controllers.HistoryController
/*9.2*/import femr.data.models.mysql.Roles

def /*14.2*/additionalStyles/*14.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.22*/("""
    """),format.raw/*15.5*/("""<link rel="stylesheet" href=""""),_display_(/*15.35*/assets/*15.41*/.path("css/history.css")),format.raw/*15.65*/("""">
""")))};def /*17.2*/additionalScripts/*17.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.23*/("""
    """),format.raw/*18.5*/("""<script type="text/javascript" src=""""),_display_(/*18.42*/assets/*18.48*/.path("js/history/history.js")),format.raw/*18.78*/(""""></script>
""")))};def /*12.2*/roles/*12.7*/ = {{currentUser.getRoles().map(r => r.getId())}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*10.1*/("""
"""),format.raw/*11.60*/("""
"""),format.raw/*12.55*/("""

"""),format.raw/*16.2*/("""
"""),format.raw/*19.2*/("""

"""),_display_(/*21.2*/main("History", currentUser, styles = additionalStyles, scripts = additionalScripts, search = search("history"), assets = assets)/*21.131*/ {_display_(Seq[Any](format.raw/*21.133*/("""
    """),_display_(/*22.6*/if(viewModel.getPatientItems.size > 1)/*22.44*/ {_display_(Seq[Any](format.raw/*22.46*/("""
        """),format.raw/*23.9*/("""<div class="encounterInfoWrap backgroundForWrap">
            <div class="row well well-sm">
                <h4 class="text-center">Duplicate Patient Search Results</h4>
                <div class="panel panel-default">
                    <table class="table vert-align">
                        <tr>
                            <th>Photo</th>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Phone Number</th>
                            <th>Gender</th>
                            <th>Age</th>
                            <th>City</th>
                            <th>Match</th>
                            <th>&nbsp;</th>
                        </tr>

                        """),_display_(/*40.26*/for(a <- 1 to viewModel.getPatientItems.size) yield /*40.71*/ {_display_(Seq[Any](format.raw/*40.73*/("""
                            """),_display_(/*41.30*/defining(viewModel.getPatientItems.get(a - 1))/*41.76*/ { patient =>_display_(Seq[Any](format.raw/*41.89*/("""
                                """),format.raw/*42.33*/("""<tr>
                                    <td class="vert-align"><img class="thumbnail searchThumb" src=""""),_display_(/*43.101*/patient/*43.108*/.getPathToPhoto),format.raw/*43.123*/("""" width="90" height="90"/></td>
                                    <td class="vert-align patientId">"""),_display_(/*44.71*/patient/*44.78*/.getId),format.raw/*44.84*/("""</td>
                                    <td class="vert-align">"""),_display_(/*45.61*/patient/*45.68*/.getFirstName),format.raw/*45.81*/(""" """),_display_(/*45.83*/patient/*45.90*/.getLastName),format.raw/*45.102*/("""</td>
                                    <td class="vert-align">"""),_display_(/*46.61*/patient/*46.68*/.getPhoneNumber),format.raw/*46.83*/("""</td>
                                    <td class="vert-align">"""),_display_(/*47.61*/patient/*47.68*/.getSex),format.raw/*47.75*/("""</td>
                                    <td class="vert-align">"""),_display_(/*48.61*/patient/*48.68*/.getAge),format.raw/*48.75*/("""</td>
                                    <td class="vert-align">"""),_display_(/*49.61*/patient/*49.68*/.getCity),format.raw/*49.76*/("""</td>
                                    <td class="vert-align">50%</td>
                                    <td class="vert-align">
                                        <button type="button" class="selectPageFromRow fButton">Select</button>
                                    </td>
                                </tr>
                            """)))}),format.raw/*55.30*/("""
                        """)))}),format.raw/*56.26*/("""
                    """),format.raw/*57.21*/("""</table>
                </div>
            </div>
        </div>

    """)))}),format.raw/*62.6*/("""

    """),_display_(/*64.6*/if(viewModel.getRankedPatientItems.size > 1)/*64.50*/ {_display_(Seq[Any](format.raw/*64.52*/("""
        """),format.raw/*65.9*/("""<div class="encounterInfoWrap backgroundForWrap">
            <div class="row well well-sm">
                <h4 class="text-center">Duplicate Patient Search Results</h4>
                <div class="panel panel-default">
                    <table class="table vert-align">
                        <tr>
                            <th>Photo</th>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Phone Number</th>
                            <th>Gender</th>
                            <th>Age</th>
                            <th>City</th>
                            <th>Match</th>
                            <th>&nbsp;</th>
                        </tr>

                        """),_display_(/*82.26*/for(a <- 1 to viewModel.getRankedPatientItems.size) yield /*82.77*/ {_display_(Seq[Any](format.raw/*82.79*/("""
                            """),_display_(/*83.30*/defining(viewModel.getRankedPatientItems.get(a - 1))/*83.82*/ { patient =>_display_(Seq[Any](format.raw/*83.95*/("""
                                """),format.raw/*84.33*/("""<tr>
                                    <td class="vert-align"><img class="thumbnail searchThumb" src=""""),_display_(/*85.101*/patient/*85.108*/.getPatientItem.getPathToPhoto),format.raw/*85.138*/("""" width="90" height="90"/></td>
                                    <td class="vert-align patientId">"""),_display_(/*86.71*/patient/*86.78*/.getPatientItem.getId),format.raw/*86.99*/("""</td>
                                    <td class="vert-align">"""),_display_(/*87.61*/patient/*87.68*/.getPatientItem.getFirstName),format.raw/*87.96*/(""" """),_display_(/*87.98*/patient/*87.105*/.getPatientItem.getLastName),format.raw/*87.132*/("""</td>
                                    <td class="vert-align">"""),_display_(/*88.61*/patient/*88.68*/.getPatientItem.getPhoneNumber),format.raw/*88.98*/("""</td>
                                    <td class="vert-align">"""),_display_(/*89.61*/patient/*89.68*/.getPatientItem.getSex),format.raw/*89.90*/("""</td>
                                    <td class="vert-align">"""),_display_(/*90.61*/patient/*90.68*/.getPatientItem.getAge),format.raw/*90.90*/("""</td>
                                    <td class="vert-align">"""),_display_(/*91.61*/patient/*91.68*/.getPatientItem.getCity),format.raw/*91.91*/("""</td>
                                    <td class="vert-align">"""),_display_(/*92.61*/patient/*92.68*/.getRank),format.raw/*92.76*/("""</td>
                                    <td class="vert-align">
                                        <button type="button" class="selectPageFromRow fButton">Select</button>
                                    </td>
                                </tr>
                            """)))}),format.raw/*97.30*/("""
                        """)))}),format.raw/*98.26*/("""
                    """),format.raw/*99.21*/("""</table>
                </div>
            </div>
        </div>

    """)))}),format.raw/*104.6*/("""
    """),format.raw/*105.5*/("""<div class="encounterInfoWrap backgroundForWrap">

        <div id="viewPatientHeader">
            <div id="patientPhoto">
            """),_display_(/*109.14*/if(viewModel.getPatientItem.getPathToPhoto != null && !viewModel.getPatientItem.getPathToPhoto.isEmpty)/*109.117*/ {_display_(Seq[Any](format.raw/*109.119*/("""

                """),format.raw/*111.17*/("""<img class="" height="90" width="90" src=""""),_display_(/*111.60*/viewModel/*111.69*/.getPatientItem.getPathToPhoto),format.raw/*111.99*/("""" />

            """)))}),format.raw/*113.14*/("""
            """),format.raw/*114.13*/("""</div>
            <div id="patientInformation">
                <h1 class="bold margin-top-zero">Patient Id: """),_display_(/*116.63*/viewModel/*116.72*/.getPatientItem.getId),format.raw/*116.93*/("""</h1>

                """),_display_(/*118.18*/if(roles.contains(Roles.ADMINISTRATOR) || roles.contains(Roles.SUPERUSER) )/*118.93*/ {_display_(Seq[Any](format.raw/*118.95*/("""
                    """),_display_(/*119.22*/helper/*119.28*/.form(action = TriageController.deletePatientPost(viewModel.getPatientItem.getId))/*119.110*/{_display_(Seq[Any](format.raw/*119.111*/("""
                        """),format.raw/*120.25*/("""<input type="hidden" name="reasonDeleted" id="reasonDeleted" />
                        <button hidden="true" type="submit"  id="deletePatient"></button>
                    """)))}),format.raw/*122.22*/("""
                    """),format.raw/*123.21*/("""<span>
                        <button type="submit" id="deletePatientBtn" class="btn btn-danger pull-right"> Delete this Patient</button>
                    </span>
                """)))}),format.raw/*126.18*/("""

                """),format.raw/*128.17*/("""<a href=""""),_display_(/*128.27*/{MedicalController.editGet(viewModel.getPatientItem.getId).url}),format.raw/*128.90*/("""" class="btn btn-default pull-right">View in Medical</a>
                <a href=""""),_display_(/*129.27*/{PharmaciesController.editGet(viewModel.getPatientItem.getId).url}),format.raw/*129.93*/("""" class="btn btn-default pull-right">View in Pharmacy</a>
                <a href=""""),_display_(/*130.27*/{TriageController.indexPopulatedGet(viewModel.getPatientItem.getId).url}),format.raw/*130.99*/("""" class="btn btn-default pull-right">See This Patient In Triage</a>

                <br/><br/>
            </div>
        </div>


        <div class="row inputRow">
            <div class="col-sm-6 col-xs-12 col-md-6">
                <h3 class="pull-left bold margin-top-zero">General Info</h3>
                <div class="medicalHistoryLineDivide"></div>
                <div class="text-center">
                    <label class="inputLabel">First Name:</label>
                    <input type="text" class="form-control input-sm pull-left" name="firstName" value=""""),_display_(/*143.105*/viewModel/*143.114*/.getPatientItem.getFirstName),format.raw/*143.142*/("""" readonly/>
                    <label class="inputLabel">Last Name:</label>
                    <input type="text" class="form-control input-sm pull-left" name="lastName" value=""""),_display_(/*145.104*/viewModel/*145.113*/.getPatientItem.getLastName),format.raw/*145.140*/("""" readonly/>
                    <label class="inputLabel">Phone Number:</label>
                    <input type="tel" class="form-control input-sm pull-left" name="phoneNumber" value=""""),_display_(/*147.106*/viewModel/*147.115*/.getPatientItem.getPhoneNumber),format.raw/*147.145*/("""" readonly/>
                    <label class="inputLabel">Address:</label>
                    <input type="text" class="form-control input-sm pull-left" name="address" value=""""),_display_(/*149.103*/viewModel/*149.112*/.getPatientItem.getAddress),format.raw/*149.138*/("""" readonly/>
                    <label class="inputLabel">City:</label>
                    <input type="text" class="form-control input-sm pull-left" name="city" value=""""),_display_(/*151.100*/viewModel/*151.109*/.getPatientItem.getCity),format.raw/*151.132*/("""" readonly/>
                    <label class="inputLabel">Age:</label>
                    <input type="text" class="form-control input-sm pull-left" name="age" value=""""),_display_(/*153.99*/viewModel/*153.108*/.getPatientItem.getAge),format.raw/*153.130*/("""" readonly/>
                    <label class="inputLabel">Sex:</label>
                    <input type="text" class="form-control input-sm pull-left" name="age" value=""""),_display_(/*155.99*/viewModel/*155.108*/.getPatientItem.getSex),format.raw/*155.130*/("""" readonly/>
                    """),format.raw/*156.43*/("""
                """),format.raw/*157.17*/("""</div>
            </div>
            <div class="col-sm-6 col-xs-12 col-md-6">
                <h3 class="pull-left bold margin-top-zero">Previous Encounters</h3>

                <div class="medicalHistoryLineDivide"></div>
                <ol>
                """),_display_(/*164.18*/for(patientEncounter <- patientEncounters) yield /*164.60*/ {_display_(Seq[Any](format.raw/*164.62*/("""
                    """),format.raw/*165.21*/("""<li>
                        <a href="/history/encounter/"""),_display_(/*166.54*/patientEncounter/*166.70*/.getId),format.raw/*166.76*/("""" class="encbtns btn btn-default btn-xs btn-block" role="button" type="button">
                            <p class="date">"""),_display_(/*167.46*/patientEncounter/*167.62*/.getTriageDateOfVisit),format.raw/*167.83*/("""</p>
                            """),_display_(/*168.30*/if(patientEncounter.getChiefComplaints != null && patientEncounter.getChiefComplaints.size > 0)/*168.125*/{_display_(Seq[Any](format.raw/*168.126*/("""
                                """),format.raw/*169.33*/("""<p class ="chiefComplaint"><strong>Chief complaint: </strong> """),_display_(/*169.96*/for(x <- 1 to patientEncounter.getChiefComplaints.size) yield /*169.151*/ {_display_(Seq[Any](format.raw/*169.153*/(""" """),_display_(/*169.155*/patientEncounter/*169.171*/.getChiefComplaints.get(x-1)),format.raw/*169.199*/("""  """),_display_(/*169.202*/if(x < patientEncounter.getChiefComplaints.size)/*169.250*/{_display_(Seq[Any](format.raw/*169.251*/(""" """),format.raw/*169.252*/("""| """)))})))}),format.raw/*169.256*/("""</p>
                            """)))}/*170.30*/else/*170.34*/{_display_(Seq[Any](format.raw/*170.35*/("""
                                """),format.raw/*171.33*/("""<p class ="chiefComplaint"><strong>Chief complaint: </strong> N/A</p>
                            """)))}),format.raw/*172.30*/("""
                        """),format.raw/*173.25*/("""</a>
                    </li>
                    <div class="medicalHistoryLineDivide"></div>
                """)))}),format.raw/*176.18*/("""
                """),format.raw/*177.17*/("""</ol>
                <div class="alert alert-info" id="encounterAlert">Click an encounter to view past history!</div>
            </div>
        </div>

    </div>
""")))}),format.raw/*183.2*/("""
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,searchError:java.lang.Boolean,viewModel:femr.ui.models.history.IndexPatientViewModelGet,patientEncounters:List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: femr.common.models.PatientEncounterItem
},assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,searchError,viewModel,patientEncounters,assets)

  def f:((femr.common.dtos.CurrentUser,java.lang.Boolean,femr.ui.models.history.IndexPatientViewModelGet,List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: femr.common.models.PatientEncounterItem
},AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,searchError,viewModel,patientEncounters,assets) => apply(currentUser,searchError,viewModel,patientEncounters,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 17 23:54:59 PST 2021
                  SOURCE: /Users/spencerklawans/Documents/newfemr/app/femr/ui/views/history/indexPatient.scala.html
                  HASH: 09c1a374552fa7bd520abae00a6d7c5c55ada84f
                  MATRIX: 1174->1|1475->232|1521->272|1570->315|1629->368|1691->424|1749->476|1801->522|1850->676|1875->692|1956->696|1988->701|2045->731|2060->737|2105->761|2132->767|2158->784|2239->788|2271->793|2335->830|2350->836|2401->866|2437->620|2450->625|2527->230|2555->558|2584->618|2613->673|2642->765|2670->879|2699->882|2838->1011|2879->1013|2911->1019|2958->1057|2998->1059|3034->1068|3809->1816|3870->1861|3910->1863|3967->1893|4022->1939|4073->1952|4134->1985|4267->2090|4284->2097|4321->2112|4450->2214|4466->2221|4493->2227|4586->2293|4602->2300|4636->2313|4665->2315|4681->2322|4715->2334|4808->2400|4824->2407|4860->2422|4953->2488|4969->2495|4997->2502|5090->2568|5106->2575|5134->2582|5227->2648|5243->2655|5272->2663|5658->3018|5715->3044|5764->3065|5866->3137|5899->3144|5952->3188|5992->3190|6028->3199|6803->3947|6870->3998|6910->4000|6967->4030|7028->4082|7079->4095|7140->4128|7273->4233|7290->4240|7342->4270|7471->4372|7487->4379|7529->4400|7622->4466|7638->4473|7687->4501|7716->4503|7733->4510|7782->4537|7875->4603|7891->4610|7942->4640|8035->4706|8051->4713|8094->4735|8187->4801|8203->4808|8246->4830|8339->4896|8355->4903|8399->4926|8492->4992|8508->4999|8537->5007|8855->5294|8912->5320|8961->5341|9064->5413|9097->5418|9262->5555|9376->5658|9418->5660|9465->5678|9536->5721|9555->5730|9607->5760|9658->5779|9700->5792|9839->5903|9858->5912|9901->5933|9953->5957|10038->6032|10079->6034|10129->6056|10145->6062|10238->6144|10279->6145|10333->6170|10540->6345|10590->6366|10806->6550|10853->6568|10891->6578|10976->6641|11087->6724|11175->6790|11287->6874|11381->6946|11981->7517|12001->7526|12052->7554|12262->7735|12282->7744|12332->7771|12547->7957|12567->7966|12620->7996|12827->8174|12847->8183|12896->8209|13097->8381|13117->8390|13163->8413|13361->8583|13381->8592|13426->8614|13624->8784|13644->8793|13689->8815|13751->8870|13797->8887|14089->9151|14148->9193|14189->9195|14239->9216|14325->9274|14351->9290|14379->9296|14532->9421|14558->9437|14601->9458|14663->9492|14769->9587|14810->9588|14872->9621|14963->9684|15036->9739|15078->9741|15109->9743|15136->9759|15187->9787|15219->9790|15278->9838|15319->9839|15350->9840|15390->9844|15444->9878|15458->9882|15498->9883|15560->9916|15691->10015|15745->10040|15890->10153|15936->10170|16133->10336
                  LINES: 30->1|33->3|34->4|35->5|36->6|37->7|38->8|39->9|41->14|41->14|43->14|44->15|44->15|44->15|44->15|45->17|45->17|47->17|48->18|48->18|48->18|48->18|49->12|49->12|50->2|51->10|52->11|53->12|55->16|56->19|58->21|58->21|58->21|59->22|59->22|59->22|60->23|77->40|77->40|77->40|78->41|78->41|78->41|79->42|80->43|80->43|80->43|81->44|81->44|81->44|82->45|82->45|82->45|82->45|82->45|82->45|83->46|83->46|83->46|84->47|84->47|84->47|85->48|85->48|85->48|86->49|86->49|86->49|92->55|93->56|94->57|99->62|101->64|101->64|101->64|102->65|119->82|119->82|119->82|120->83|120->83|120->83|121->84|122->85|122->85|122->85|123->86|123->86|123->86|124->87|124->87|124->87|124->87|124->87|124->87|125->88|125->88|125->88|126->89|126->89|126->89|127->90|127->90|127->90|128->91|128->91|128->91|129->92|129->92|129->92|134->97|135->98|136->99|141->104|142->105|146->109|146->109|146->109|148->111|148->111|148->111|148->111|150->113|151->114|153->116|153->116|153->116|155->118|155->118|155->118|156->119|156->119|156->119|156->119|157->120|159->122|160->123|163->126|165->128|165->128|165->128|166->129|166->129|167->130|167->130|180->143|180->143|180->143|182->145|182->145|182->145|184->147|184->147|184->147|186->149|186->149|186->149|188->151|188->151|188->151|190->153|190->153|190->153|192->155|192->155|192->155|193->156|194->157|201->164|201->164|201->164|202->165|203->166|203->166|203->166|204->167|204->167|204->167|205->168|205->168|205->168|206->169|206->169|206->169|206->169|206->169|206->169|206->169|206->169|206->169|206->169|206->169|206->169|207->170|207->170|207->170|208->171|209->172|210->173|213->176|214->177|220->183
                  -- GENERATED --
              */
          