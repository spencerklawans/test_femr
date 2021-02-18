
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

object indexEncounter extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[femr.common.dtos.CurrentUser,femr.ui.models.history.IndexEncounterViewModel,femr.ui.models.history.IndexEncounterMedicalViewModel,femr.ui.models.history.IndexEncounterPharmacyViewModel,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser,
        viewModel: femr.ui.models.history.IndexEncounterViewModel,
        viewModelMedical: femr.ui.models.history.IndexEncounterMedicalViewModel,
        viewModelPharmacy: femr.ui.models.history.IndexEncounterPharmacyViewModel,
        assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.6*/import femr.ui.views.html.layouts.main
/*8.6*/import femr.ui.views.html.partials.helpers.outputStringOrNA
/*9.6*/import femr.ui.views.html.partials.helpers.outputIntOrNA
/*10.6*/import femr.ui.views.html.partials.helpers.outputHeightOrNA
/*11.6*/import femr.ui.views.html.partials.helpers.outputWeightOrNA
/*12.6*/import femr.ui.views.html.partials.helpers.outputBloodPressureOrNA
/*13.6*/import femr.ui.views.html.partials.helpers.outputYesOrNA
/*15.6*/import femr.ui.views.html.partials.helpers.outputTemperatureOrNA
/*17.6*/import femr.ui.views.html.partials.encounter.dynamicTabSpan
/*18.6*/import femr.data.models.mysql.Roles
/*20.6*/import collection.JavaConversions._
/*21.6*/import femr.ui.controllers.routes.PDFController
/*22.6*/import femr.ui.controllers.routes.TriageController

def /*27.6*/additionalScripts/*27.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*27.27*/("""
        """),format.raw/*28.9*/("""<script type="text/javascript" src=""""),_display_(/*28.46*/assets/*28.52*/.path("js/libraries/jquery-2.2.4.min.js")),format.raw/*28.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*29.46*/assets/*29.52*/.path("js/libraries/jquery.tablescroll.js")),format.raw/*29.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*30.46*/assets/*30.52*/.path("js/history/history.js")),format.raw/*30.82*/(""""></script>
    """)))};def /*32.6*/additionalStyles/*32.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.26*/("""
        """),format.raw/*33.9*/("""<link rel="stylesheet" href=""""),_display_(/*33.39*/assets/*33.45*/.path("css/libraries/jquery.tablescroll.css")),format.raw/*33.90*/("""">
        <link rel="stylesheet" href=""""),_display_(/*34.39*/assets/*34.45*/.path("css/history.css")),format.raw/*34.69*/("""">
    """)))};def /*25.6*/roles/*25.11*/ = {{currentUser.getRoles().map(r => r.getId())}};def /*38.6*/editClass/*38.15*/ = {{if(viewModel.getPatientEncounterItem.getIsClosed) "editable" else "nonEditable" }};
Seq[Any](format.raw/*6.1*/("""
    """),format.raw/*8.1*/("""    """),format.raw/*9.1*/("""    """),format.raw/*10.1*/("""    """),format.raw/*11.1*/("""    """),format.raw/*12.1*/("""    """),format.raw/*13.1*/("""    """),format.raw/*14.1*/("""
    """),format.raw/*16.1*/("""
    """),format.raw/*18.1*/("""    """),format.raw/*19.1*/("""
    """),format.raw/*21.1*/("""    """),format.raw/*22.1*/("""    """),format.raw/*23.1*/("""
    """),format.raw/*24.64*/("""
    """),format.raw/*25.59*/("""

    """),format.raw/*31.6*/("""
    """),format.raw/*35.6*/("""

    """),format.raw/*37.90*/("""
    """),format.raw/*38.101*/("""

    """),_display_(/*40.6*/main("History", currentUser, scripts = additionalScripts, styles = additionalStyles, assets = assets)/*40.107*/ {_display_(Seq[Any](format.raw/*40.109*/("""
        """),format.raw/*41.9*/("""<div class="sectionBackground backgroundForWrap" id="encounterViewWrap">
            <div id="encounterViewHeader">


                <img class="" height="90" width="90" src=""""),_display_(/*45.60*/viewModel/*45.69*/.getPatientItem.getPathToPhoto),format.raw/*45.99*/("""" />
                <p>"""),_display_(/*46.21*/viewModel/*46.30*/.getPatientItem.getFirstName),format.raw/*46.58*/(""" """),_display_(/*46.60*/viewModel/*46.69*/.getPatientItem.getLastName),format.raw/*46.96*/("""
                    """),format.raw/*47.21*/("""("""),_display_(/*47.23*/viewModel/*47.32*/.getPatientItem.getId),format.raw/*47.53*/(""")</p>

                <a href=""""),_display_(/*49.27*/PDFController/*49.40*/.index(viewModel.getPatientEncounterItem.getId)),format.raw/*49.87*/("""" target="_blank" id="historyButton" class="btn btn-default pull-left">Generate PDF</a>

                """),_display_(/*51.18*/if(roles.contains(Roles.ADMINISTRATOR) || roles.contains(Roles.SUPERUSER) )/*51.93*/ {_display_(Seq[Any](format.raw/*51.95*/("""
                    """),_display_(/*52.22*/helper/*52.28*/.form(action = TriageController.deleteEncounterPost(viewModel.getPatientItem.getId, viewModel.getPatientEncounterItem.getId))/*52.153*/ {_display_(Seq[Any](format.raw/*52.155*/("""
                        """),format.raw/*53.25*/("""<input type="hidden" name="reasonEncounterDeleted" class="reasonEncounterDeleted" />
                        <button hidden="true" type="submit" class="deleteEcounter"></button>

                        <span>
                            <button type="submit" class="deleteEncounterbtn btn btn-danger pull-right" >
                                Delete this Encounter</button>
                        </span>
                    """)))}),format.raw/*60.22*/("""
                """)))}),format.raw/*61.18*/("""


            """),format.raw/*64.13*/("""</div>

            <div class="encounterViewBodyHeader">
                <p>Basic Information and Vitals</p>
            </div>
            <div class="encounterViewBody">
                <input type="hidden" id="patientEncounterId" value=""""),_display_(/*70.70*/viewModel/*70.79*/.getPatientEncounterItem.getId),format.raw/*70.109*/("""" />
                <div class="encounterViewBodyLeft">
                    <div class="row">
                """),_display_(/*73.18*/defining(viewModel.getPatientItem)/*73.52*/ { patient =>_display_(Seq[Any](format.raw/*73.65*/("""
                    """),format.raw/*74.21*/("""<div class="encounterViewBodyLeftHalf">
                        <p><span class="infoLabel">First Name:</span> """),_display_(/*75.72*/outputStringOrNA(patient.getFirstName)),format.raw/*75.110*/("""</p>
                        <p><span class="infoLabel">Last Name:</span> """),_display_(/*76.71*/outputStringOrNA(patient.getLastName)),format.raw/*76.108*/("""</p>
                        <p><span class="infoLabel">Address:</span> """),_display_(/*77.69*/outputStringOrNA(patient.getAddress)),format.raw/*77.105*/("""</p>
                        <p><span class="infoLabel">Phone Number:</span> """),_display_(/*78.74*/outputStringOrNA(patient.getPhoneNumber)),format.raw/*78.114*/("""</p>
                        <p><span class="infoLabel">Birthday:</span> """),_display_(/*79.70*/outputStringOrNA(patient.getFriendlyDateOfBirth)),format.raw/*79.118*/("""</p>
                        <p><span class="infoLabel">Age:</span> """),_display_(/*80.65*/outputStringOrNA(patient.getAge)),format.raw/*80.97*/("""</p>
                        <p><span class="infoLabel">Gender:</span> """),_display_(/*81.68*/outputStringOrNA(patient.getSex)),format.raw/*81.100*/("""</p>
                    </div>
                    <div class="encounterViewBodyLeftHalf">
                        <!-- """),format.raw/*84.43*/(""" """),format.raw/*84.44*/("""-->
                        """),_display_(/*85.26*/defining(viewModelMedical.getVitalList)/*85.65*/ { vitalMap =>_display_(Seq[Any](format.raw/*85.79*/("""
                            """),format.raw/*86.29*/("""<p>
                                <span class="infoLabel">Weeks Pregnant:</span>
                                """),_display_(/*88.34*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*88.95*/ {_display_(Seq[Any](format.raw/*88.97*/("""
                                    """),format.raw/*89.37*/("""<span>
                                    """),_display_(/*90.38*/outputStringOrNA(vitalMap.get("weeksPregnant", vitalMap.getDate(dateIndex - 1)))),format.raw/*90.118*/("""
                                    """),format.raw/*91.37*/("""</span>
                                """)))}),format.raw/*92.34*/("""
                            """),format.raw/*93.29*/("""</p>

                        <p><span class="infoLabel">Height:</span>
                            """),_display_(/*96.30*/defining(viewModelMedical.getVitalList)/*96.69*/ { vitalMap =>_display_(Seq[Any](format.raw/*96.83*/("""
                                """),_display_(/*97.34*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*97.95*/ {_display_(Seq[Any](format.raw/*97.97*/("""
                                    """),_display_(/*98.38*/if(viewModelMedical.getSettings.isMetric)/*98.79*/ {_display_(Seq[Any](format.raw/*98.81*/("""
                                        """),_display_(/*99.42*/outputHeightOrNA(
                                            vitalMap.get("heightMeters", vitalMap.getDate(dateIndex - 1)),
                                            vitalMap.get("heightCm", vitalMap.getDate(dateIndex - 1)),
                                            viewModelMedical.getSettings.isMetric,
                                            ""
                                        ))))}/*104.43*/else/*104.48*/{_display_(Seq[Any](format.raw/*104.49*/("""
                                        """),_display_(/*105.42*/outputHeightOrNA(
                                            vitalMap.get("heightFeet", vitalMap.getDate(dateIndex - 1)),
                                            vitalMap.get("heightInches", vitalMap.getDate(dateIndex - 1)),
                                            viewModelMedical.getSettings.isMetric,
                                            ""
                                        )),format.raw/*110.42*/("""
                                    """)))}),format.raw/*111.38*/("""
                                """)))}),format.raw/*112.34*/("""
                        """),format.raw/*113.25*/("""</p>

                        <p><span class="infoLabel">Weight:</span>
                        """),_display_(/*116.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*116.87*/ {_display_(Seq[Any](format.raw/*116.89*/("""

                            """),_display_(/*118.30*/if(viewModelMedical.getSettings.isMetric)/*118.71*/ {_display_(Seq[Any](format.raw/*118.73*/("""
                                """),_display_(/*119.34*/outputWeightOrNA(vitalMap.get("weightKgs", vitalMap.getDate(dateIndex - 1)), viewModelMedical.getSettings.isMetric, "")),format.raw/*119.153*/("""

                            """)))}/*121.31*/else/*121.36*/{_display_(Seq[Any](format.raw/*121.37*/("""
                                """),_display_(/*122.34*/outputWeightOrNA(vitalMap.get("weight", vitalMap.getDate(dateIndex - 1)), viewModelMedical.getSettings.isMetric, "")),format.raw/*122.150*/("""

                            """)))}),format.raw/*124.30*/("""

                            """)))}),format.raw/*126.30*/("""

                        """),format.raw/*128.25*/("""</p>

                    """)))}),format.raw/*130.22*/("""
                        """),_display_(/*131.26*/defining(viewModelMedical.getVitalList)/*131.65*/ { vitalMap =>_display_(Seq[Any](format.raw/*131.79*/("""

                            """),format.raw/*133.29*/("""<p><span class="infoLabel">Smoking:</span>
                                """),_display_(/*134.34*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*134.95*/ {_display_(Seq[Any](format.raw/*134.97*/("""
                                    """),format.raw/*135.37*/("""<span>
                                    """),_display_(/*136.38*/outputYesOrNA(vitalMap.get("smoker", vitalMap.getDate(dateIndex - 1)))),format.raw/*136.108*/("""
                                    """),format.raw/*137.37*/("""</span>
                                """)))}),format.raw/*138.34*/("""
                                """),format.raw/*139.33*/("""</p>

                            <p><span class="infoLabel">Diabetes:</span>
                                """),_display_(/*142.34*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*142.95*/ {_display_(Seq[Any](format.raw/*142.97*/("""
                                    """),format.raw/*143.37*/("""<span>
                                    """),_display_(/*144.38*/outputYesOrNA(vitalMap.get("diabetic", vitalMap.getDate(dateIndex - 1)))),format.raw/*144.110*/("""
                                    """),format.raw/*145.37*/("""</span>
                                """)))}),format.raw/*146.34*/("""
                            """),format.raw/*147.29*/("""</p>

                            <p><span class="infoLabel">Alcohol:</span>
                                """),_display_(/*150.34*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*150.95*/ {_display_(Seq[Any](format.raw/*150.97*/("""
                                    """),format.raw/*151.37*/("""<span>
                                        """),_display_(/*152.42*/outputYesOrNA(vitalMap.get("alcohol", vitalMap.getDate(dateIndex - 1)))),format.raw/*152.113*/("""
                                    """)))}),format.raw/*153.38*/("""       """),format.raw/*153.45*/("""</span>
                            </p>

                            <p><span class="infoLabel">Cholesterol:</span>
                                """),_display_(/*157.34*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*157.95*/ {_display_(Seq[Any](format.raw/*157.97*/("""
                                    """),format.raw/*158.37*/("""<span>
                                        """),_display_(/*159.42*/outputYesOrNA(vitalMap.get("cholesterol", vitalMap.getDate(dateIndex - 1)))),format.raw/*159.117*/("""
                                    """)))}),format.raw/*160.38*/("""       """),format.raw/*160.45*/("""</span>
                            </p>

                            <p><span class="infoLabel">Hypertension:</span>
                                """),_display_(/*164.34*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*164.95*/ {_display_(Seq[Any](format.raw/*164.97*/("""
                                    """),format.raw/*165.37*/("""<span>
                                        """),_display_(/*166.42*/outputYesOrNA(vitalMap.get("hypertension", vitalMap.getDate(dateIndex - 1)))),format.raw/*166.118*/("""
                                    """)))}),format.raw/*167.38*/("""       """),format.raw/*167.45*/("""</span>
                            </p>
                        """)))}),format.raw/*169.26*/("""

                        """),format.raw/*171.25*/("""</div>

                """)))}),format.raw/*173.18*/("""
                    """),format.raw/*174.21*/("""</div>
                </div>
                <div class="encounterViewBodyMiddle">
                """),_display_(/*177.18*/defining(viewModel.getPatientEncounterItem)/*177.61*/ { encounter =>_display_(Seq[Any](format.raw/*177.76*/("""
                    """),format.raw/*178.108*/("""
                    """),format.raw/*179.101*/("""
                    """),format.raw/*180.29*/("""
                    """),format.raw/*181.110*/("""
                    """),format.raw/*182.109*/("""
                    """),format.raw/*183.29*/("""
                    """),format.raw/*184.112*/("""
                    """),format.raw/*185.111*/("""

                    """),format.raw/*187.21*/("""<p><span class="infoLabel">Triage Visit:</span> """),_display_(/*187.70*/encounter/*187.79*/.getTriageDateOfVisit),format.raw/*187.100*/("""</p>
                    <p><span class="infoLabel">Nurse:</span> """),_display_(/*188.63*/encounter/*188.72*/.getNurseFullName),format.raw/*188.89*/("""</p> """),format.raw/*188.111*/("""
                    """),format.raw/*189.21*/("""<br>
                    <p><span class="infoLabel">Medical Visit:</span> """),_display_(/*190.71*/encounter/*190.80*/.getMedicalDateOfVisit),format.raw/*190.102*/("""</p>
                    <p><span class="infoLabel">Physician:</span> """),_display_(/*191.67*/encounter/*191.76*/.getPhysicianFullName),format.raw/*191.97*/("""</p> """),format.raw/*191.119*/("""
                    """),format.raw/*192.21*/("""<br>
                    <p><span class="infoLabel">Pharmacy Visit:</span> """),_display_(/*193.72*/encounter/*193.81*/.getPharmacyDateOfVisit),format.raw/*193.104*/("""</p>
                    <p><span class="infoLabel">Pharmacist:</span> """),_display_(/*194.68*/encounter/*194.77*/.getPharmacistFullName),format.raw/*194.99*/("""</p> """),format.raw/*194.121*/("""


                """)))}),format.raw/*197.18*/("""
                """),format.raw/*198.17*/("""</div>

                <div class="encounterViewBodyRight">
                """),_display_(/*201.18*/defining(viewModelMedical.getVitalList)/*201.57*/ { vitalMap =>_display_(Seq[Any](format.raw/*201.71*/("""
                    """),format.raw/*202.21*/("""<p><span class="infoLabel">Temperature:</span>
                    """),_display_(/*203.22*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*203.83*/ {_display_(Seq[Any](format.raw/*203.85*/("""
                        """),_display_(/*204.26*/if(viewModelMedical.getSettings.isMetric)/*204.67*/ {_display_(Seq[Any](format.raw/*204.69*/("""
                            """),_display_(/*205.30*/outputTemperatureOrNA(vitalMap.get("temperatureCelsius", vitalMap.getDate(dateIndex - 1)), viewModelMedical.getSettings.isMetric, "")),format.raw/*205.163*/("""
                        """)))}/*206.27*/else/*206.32*/{_display_(Seq[Any](format.raw/*206.33*/("""
                            """),_display_(/*207.30*/outputTemperatureOrNA(vitalMap.get("temperature", vitalMap.getDate(dateIndex - 1)), viewModelMedical.getSettings.isMetric, "")),format.raw/*207.156*/("""

                        """)))}),format.raw/*209.26*/("""
                    """)))}),format.raw/*210.22*/("""
                        """),format.raw/*211.25*/("""</p>

                    <p>
                        <span class="infoLabel">Blood Pressure:</span>
                        """),_display_(/*215.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*215.87*/ {_display_(Seq[Any](format.raw/*215.89*/("""
                            """),format.raw/*216.29*/("""<span>
                            """),_display_(/*217.30*/outputBloodPressureOrNA(vitalMap.get("bloodPressureSystolic", vitalMap.getDate(dateIndex - 1)), vitalMap.get("bloodPressureDiastolic", vitalMap.getDate(dateIndex - 1)))),format.raw/*217.198*/("""
                            """),format.raw/*218.29*/("""</span>
                        """)))}),format.raw/*219.26*/("""
                    """),format.raw/*220.21*/("""</p>
                    <p>
                        <span class="infoLabel">Heart Rate:</span>
                        """),_display_(/*223.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*223.87*/ {_display_(Seq[Any](format.raw/*223.89*/("""
                            """),format.raw/*224.29*/("""<span>
                             """),_display_(/*225.31*/outputStringOrNA(vitalMap.get("heartRate", vitalMap.getDate(dateIndex - 1)))),format.raw/*225.107*/("""
                            """),format.raw/*226.29*/("""</span>
                        """)))}),format.raw/*227.26*/("""
                    """),format.raw/*228.21*/("""</p>
                    <p>
                        <span class="infoLabel">Respiration Rate:</span>
                        """),_display_(/*231.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*231.87*/ {_display_(Seq[Any](format.raw/*231.89*/("""
                            """),format.raw/*232.29*/("""<span>
                            """),_display_(/*233.30*/outputStringOrNA(vitalMap.get("respiratoryRate", vitalMap.getDate(dateIndex - 1)))),format.raw/*233.112*/("""
                            """),format.raw/*234.29*/("""</span>
                        """)))}),format.raw/*235.26*/("""
                    """),format.raw/*236.21*/("""</p>
                    <p>
                        <span class="infoLabel">Oxygen Saturation:</span>
                        """),_display_(/*239.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*239.87*/ {_display_(Seq[Any](format.raw/*239.89*/("""
                            """),format.raw/*240.29*/("""<span>
                            """),_display_(/*241.30*/outputStringOrNA(vitalMap.get("oxygenSaturation", vitalMap.getDate(dateIndex - 1)))),format.raw/*241.113*/("""
                            """),format.raw/*242.29*/("""</span>
                        """)))}),format.raw/*243.26*/("""
                    """),format.raw/*244.21*/("""</p>
                    <p>
                        <span class="infoLabel">Glucose:</span>
                        """),_display_(/*247.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*247.87*/ {_display_(Seq[Any](format.raw/*247.89*/("""
                            """),format.raw/*248.29*/("""<span>
                            """),_display_(/*249.30*/outputStringOrNA(vitalMap.get("glucose", vitalMap.getDate(dateIndex - 1)))),format.raw/*249.104*/("""
                            """),format.raw/*250.29*/("""</span>
                        """)))}),format.raw/*251.26*/("""
                    """),format.raw/*252.21*/("""</p>
                """)))}),format.raw/*253.18*/("""
                """),format.raw/*254.17*/("""</div>
            </div>


            <div class="encounterViewBodyHeader">
                <p>Assessment</p>
            </div>
            <div class="encounterViewBody">
                <div class="encounterViewBodyLeft">
                    """),format.raw/*263.69*/("""
                    """),_display_(/*264.22*/defining(viewModelMedical.getPmhFields)/*264.61*/ { pmhFieldMap =>_display_(Seq[Any](format.raw/*264.78*/("""
                        """),format.raw/*265.25*/("""<p><a class="infoLabel """),_display_(/*265.49*/editClass),format.raw/*265.58*/(""""> Medical/Surgical History:</a>
                            """),_display_(/*266.30*/dynamicTabSpan(pmhFieldMap.get("medicalSurgicalHistory"))),format.raw/*266.87*/("""
                        """),format.raw/*267.25*/("""</p>
                        <p><a class="infoLabel """),_display_(/*268.49*/editClass),format.raw/*268.58*/(""""> Social History:</a>
                            """),_display_(/*269.30*/dynamicTabSpan(pmhFieldMap.get("socialHistory"))),format.raw/*269.78*/("""
                        """),format.raw/*270.25*/("""<p><a class="infoLabel """),_display_(/*270.49*/editClass),format.raw/*270.58*/("""">Current Medications:</a>
                            """),_display_(/*271.30*/dynamicTabSpan(pmhFieldMap.get("currentMedication"))),format.raw/*271.82*/("""
                        """),format.raw/*272.25*/("""<p><a class="infoLabel """),_display_(/*272.49*/editClass),format.raw/*272.58*/(""""> Family History: </a>
                            """),_display_(/*273.30*/dynamicTabSpan(pmhFieldMap.get("familyHistory"))),format.raw/*273.78*/("""
                    """)))}),format.raw/*274.22*/("""
                    """),_display_(/*275.22*/defining(viewModelMedical.getTreatmentFields)/*275.67*/ { treatmentFieldMap =>_display_(Seq[Any](format.raw/*275.90*/("""
                        """),format.raw/*276.25*/("""<p><a  class="infoLabel """),_display_(/*276.50*/editClass),format.raw/*276.59*/(""""> Assessment: </a>
                            """),_display_(/*277.30*/dynamicTabSpan(treatmentFieldMap.get("assessment"))),format.raw/*277.81*/("""

                        """),format.raw/*279.25*/("""<p><a class="infoLabel """),_display_(/*279.49*/editClass),format.raw/*279.58*/("""">Procedure/Counseling:</a>
                            """),_display_(/*280.30*/dynamicTabSpan(treatmentFieldMap.get("procedure_counseling"))),format.raw/*280.91*/("""
                    """)))}),format.raw/*281.22*/("""
                    """),_display_(/*282.22*/for(problemIterator <- 1 to viewModelPharmacy.getProblems.size) yield /*282.85*/{_display_(Seq[Any](format.raw/*282.86*/("""
                        """),format.raw/*283.25*/("""<p><a class="infoLabel nonEditable">Diagnosis:</a>
                            <span class="value">"""),_display_(/*284.50*/outputStringOrNA(viewModelPharmacy.getProblems.get(problemIterator - 1))),format.raw/*284.122*/("""</span></p>
                    """)))}),format.raw/*285.22*/("""
                    """),_display_(/*286.22*/if(!viewModelPharmacy.getPrescriptions.isEmpty())/*286.71*/{_display_(Seq[Any](format.raw/*286.72*/("""
                        """),format.raw/*287.25*/("""<p> <span class="infoLabel">Dispensed Medication(s):</span> </p>

                        """),_display_(/*289.26*/for(x <- 1 to viewModelPharmacy.getPrescriptions.size) yield /*289.80*/ {_display_(Seq[Any](format.raw/*289.82*/("""
                            """),_display_(/*290.30*/defining(viewModelPharmacy.getPrescriptions.get(x - 1))/*290.85*/ { prescription =>_display_(Seq[Any](format.raw/*290.103*/("""
                                """),format.raw/*291.33*/("""<div class="prescription-row">
                                  """),_display_(/*292.36*/if(prescription.getReplacementMedicationName != null)/*292.89*/ {_display_(Seq[Any](format.raw/*292.91*/("""
                                          """),format.raw/*293.43*/("""<p>
                                              <span class="prescription-id">Prescription #"""),_display_(/*294.92*/prescription/*294.104*/.getId()),format.raw/*294.112*/(""" """),format.raw/*294.113*/("""- <span class="red">Replaced</span></span>
                                              <del>"""),_display_(/*295.53*/prescription/*295.65*/.printFullPrescriptionName),format.raw/*295.91*/("""</del>
                                          </p>
                                      <div class="alert">This prescription was replaced by prescription #"""),_display_(/*297.107*/prescription/*297.119*/.getReplacementId),format.raw/*297.136*/("""</div>
                                  """)))}/*298.37*/else/*298.42*/{_display_(Seq[Any](format.raw/*298.43*/("""
                                      """),format.raw/*299.39*/("""<p>
                                          <span class="prescription-id">Prescription #"""),_display_(/*300.88*/prescription/*300.100*/.getId()),format.raw/*300.108*/("""</span>
                                          """),_display_(/*301.44*/prescription/*301.56*/.printFullPrescriptionName),format.raw/*301.82*/("""
                                      """),format.raw/*302.39*/("""</p>
                                  """)))}),format.raw/*303.36*/("""
                                """),format.raw/*304.33*/("""</div>
                            """)))}),format.raw/*305.30*/("""
                        """)))}),format.raw/*306.26*/("""

                    """)))}),format.raw/*308.22*/("""


                """),format.raw/*311.17*/("""</div>
                <div class="encounterViewBodyMiddle">
                """),_display_(/*313.18*/if(viewModelMedical.isMultipleChiefComplaints)/*313.64*/ {_display_(Seq[Any](format.raw/*313.66*/("""
                    """),_display_(/*314.22*/for((key, value) <- viewModelMedical.getHpiFieldsWithMultipleChiefComplaints) yield /*314.99*/ {_display_(Seq[Any](format.raw/*314.101*/("""
                        """),format.raw/*315.25*/("""<div>
                        <h4 data-complaint=""""),_display_(/*316.46*/key),format.raw/*316.49*/("""">Chief Complaint: """),_display_(/*316.69*/key),format.raw/*316.72*/("""</h4>
                        <p> <a class="infoLabel """),_display_(/*317.50*/editClass),format.raw/*317.59*/("""">Onset:</a>
                            """),_display_(/*318.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("onset"))),format.raw/*318.124*/("""
                        """),format.raw/*319.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*320.50*/editClass),format.raw/*320.59*/(""""> Quality: </a>
                            """),_display_(/*321.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("quality"))),format.raw/*321.126*/("""
                        """),format.raw/*322.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*323.50*/editClass),format.raw/*323.59*/("""">Radiation:</a>
                            """),_display_(/*324.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("radiation"))),format.raw/*324.128*/("""
                        """),format.raw/*325.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*326.50*/editClass),format.raw/*326.59*/("""">Severity:</a>
                            """),_display_(/*327.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("severity"))),format.raw/*327.127*/("""
                        """),format.raw/*328.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*329.50*/editClass),format.raw/*329.59*/("""">Provokes:</a>
                            """),_display_(/*330.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("provokes"))),format.raw/*330.127*/("""
                        """),format.raw/*331.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*332.50*/editClass),format.raw/*332.59*/("""">Palliates:</a>
                            """),_display_(/*333.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("palliates"))),format.raw/*333.128*/("""
                        """),format.raw/*334.25*/("""</p>

                        <p> <a class="infoLabel """),_display_(/*336.50*/editClass),format.raw/*336.59*/("""">Narrative:</a>
                            """),_display_(/*337.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("narrative"))),format.raw/*337.128*/("""
                        """),format.raw/*338.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*339.50*/editClass),format.raw/*339.59*/("""">Time Of Day:</a>
                            """),_display_(/*340.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("timeOfDay"))),format.raw/*340.128*/("""
                        """),format.raw/*341.25*/("""</p>

                        <p> <a class="infoLabel """),_display_(/*343.50*/editClass),format.raw/*343.59*/("""">Physical Examination:</a>
                            """),_display_(/*344.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("physicalExamination"))),format.raw/*344.138*/("""
                        """),format.raw/*345.25*/("""</p>

                        </div>
                        <br>
                    """)))}),format.raw/*349.22*/("""
                """)))}/*350.19*/else/*350.24*/{_display_(Seq[Any](format.raw/*350.25*/("""
                    """),format.raw/*351.21*/("""<div>
                    """),_display_(/*352.22*/if(viewModel.getPatientEncounterItem.getChiefComplaints != null && viewModel.getPatientEncounterItem.getChiefComplaints.size > 0)/*352.151*/{_display_(Seq[Any](format.raw/*352.152*/("""
                        """),format.raw/*353.25*/("""<h4 data-complaint=""""),_display_(/*353.46*/viewModel/*353.55*/.getPatientEncounterItem.getChiefComplaints.get(0)),format.raw/*353.105*/("""">Chief Complaint: """),_display_(/*353.125*/viewModel/*353.134*/.getPatientEncounterItem.getChiefComplaints.get(0)),format.raw/*353.184*/(""" """),format.raw/*353.185*/("""</h4>
                    """)))}),format.raw/*354.22*/("""
                    """),format.raw/*355.21*/("""<p> <a class= "infoLabel """),_display_(/*355.47*/editClass),format.raw/*355.56*/("""">Onset:</a>
                        """),_display_(/*356.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("onset"))),format.raw/*356.114*/("""
                    """),format.raw/*357.21*/("""</p>
                    <p> <a class= "infoLabel """),_display_(/*358.47*/editClass),format.raw/*358.56*/("""">Quality:</a>
                        """),_display_(/*359.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("quality"))),format.raw/*359.116*/("""
                    """),format.raw/*360.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*362.47*/editClass),format.raw/*362.56*/("""">Radiation:</a>
                    """),_display_(/*363.22*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("radiation"))),format.raw/*363.114*/("""
                    """),format.raw/*364.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*366.47*/editClass),format.raw/*366.56*/("""">Severity:</a>
                        """),_display_(/*367.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("severity"))),format.raw/*367.117*/("""
                    """),format.raw/*368.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*370.47*/editClass),format.raw/*370.56*/("""">Provokes:</a>
                        """),_display_(/*371.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("provokes"))),format.raw/*371.117*/("""
                    """),format.raw/*372.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*374.47*/editClass),format.raw/*374.56*/("""">Palliates:</a>
                        """),_display_(/*375.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("palliates"))),format.raw/*375.118*/("""
                    """),format.raw/*376.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*378.47*/editClass),format.raw/*378.56*/("""">Time Of Day:</a>
                        """),_display_(/*379.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("timeOfDay"))),format.raw/*379.118*/("""
                    """),format.raw/*380.21*/("""</p>
                    <p> <a class= "infoLabel """),_display_(/*381.47*/editClass),format.raw/*381.56*/("""">Narrative:</a>
                        """),_display_(/*382.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("narrative"))),format.raw/*382.118*/("""
                    """),format.raw/*383.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*385.47*/editClass),format.raw/*385.56*/("""">Physical Examination:</a>
                        """),_display_(/*386.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("physicalExamination"))),format.raw/*386.128*/("""
                    """),format.raw/*387.21*/("""</p>
                    </div>

                """)))}),format.raw/*390.18*/("""


                """),format.raw/*393.17*/("""</div>

                <div class="encounterViewBodyRight">
                    """),format.raw/*396.58*/("""
                    """),_display_(/*397.22*/for((key, value) <- viewModelMedical.getCustomFields) yield /*397.75*/ {_display_(Seq[Any](format.raw/*397.77*/("""
                        """),format.raw/*398.25*/("""<p><span class="infoLabel nonEditable">
                            """),_display_(/*399.30*/key),format.raw/*399.33*/(""":
                        </span>
                            """),_display_(/*401.30*/outputStringOrNA(viewModelMedical.getCustomFields.get(key).getValue)),format.raw/*401.98*/("""
                        """),format.raw/*402.25*/("""</p>
                    """)))}),format.raw/*403.22*/("""

                """),format.raw/*405.17*/("""</div>
            </div>

            """),_display_(/*408.14*/if(viewModelMedical.getPhotos.size > 0)/*408.53*/ {_display_(Seq[Any](format.raw/*408.55*/("""
                """),format.raw/*409.17*/("""<div class="encounterViewBodyHeader">
                    <p>Photos</p>
                </div>
                <div class="encounterViewBody">
                """),_display_(/*413.18*/for(x <- 1 to viewModelMedical.getPhotos.size) yield /*413.64*/ {_display_(Seq[Any](format.raw/*413.66*/("""
                    """),format.raw/*414.21*/("""<img src=""""),_display_(/*414.32*/viewModelMedical/*414.48*/.getPhoto(x - 1).getImageUrl),format.raw/*414.76*/("""">
                    <p class="imageDescription">"""),_display_(/*415.50*/viewModelMedical/*415.66*/.getPhoto(x - 1).getImageDesc),format.raw/*415.95*/("""</p>
                """)))}),format.raw/*416.18*/("""

                """),format.raw/*418.17*/("""</div>
            """)))}),format.raw/*419.14*/("""

            """),format.raw/*421.13*/("""<div id="edit-form" >

                <p class="form-label"></p>
                <input type="text" id="editInput" class="form-control input-sm pull-left value" name="edit-value"  value=""/>
                <input  id = "fieldIdInput" class= "fieldId" type="hidden" name="edit-field-name" value="" />

                <button type="button" id="saveEncounterBtn" class="fButton">Save</button>
                <button type="button" id="cancelEncounterBtn" class="fButton">Cancel</button>

                <div  class="form-history">
                    <table id="tabFieldHistory" cellspacing="0">
                    </table>
                </div>
            </div>

        </div>

    """)))}),format.raw/*438.6*/("""
""")))}),format.raw/*439.2*/("""


"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.history.IndexEncounterViewModel,viewModelMedical:femr.ui.models.history.IndexEncounterMedicalViewModel,viewModelPharmacy:femr.ui.models.history.IndexEncounterPharmacyViewModel,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel,viewModelMedical,viewModelPharmacy,assets)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.history.IndexEncounterViewModel,femr.ui.models.history.IndexEncounterMedicalViewModel,femr.ui.models.history.IndexEncounterPharmacyViewModel,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel,viewModelMedical,viewModelPharmacy,assets) => apply(currentUser,viewModel,viewModelMedical,viewModelPharmacy,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 17 23:54:59 PST 2021
                  SOURCE: /Users/spencerklawans/Documents/newfemr/app/femr/ui/views/history/indexEncounter.scala.html
                  HASH: d892a38ccceefbb9c56bc64b47c2e391685e1d19
                  MATRIX: 1164->1|1541->312|1587->356|1654->421|1719->483|1787->548|1855->613|1930->685|1995->748|2068->819|2136->884|2180->926|2224->967|2280->1020|2344->1201|2370->1218|2451->1222|2487->1231|2551->1268|2566->1274|2628->1315|2712->1372|2727->1378|2791->1421|2875->1478|2890->1484|2941->1514|2981->1537|3006->1553|3087->1557|3123->1566|3180->1596|3195->1602|3261->1647|3329->1688|3344->1694|3389->1718|3420->1141|3434->1146|3496->1823|3514->1832|3629->306|3660->351|3690->416|3721->478|3752->543|3783->608|3814->680|3845->742|3877->813|3909->879|3940->920|3972->962|4003->1015|4034->1071|4067->1135|4100->1194|4133->1531|4165->1726|4199->1817|4233->1918|4266->1925|4377->2026|4418->2028|4454->2037|4658->2214|4676->2223|4727->2253|4779->2278|4797->2287|4846->2315|4875->2317|4893->2326|4941->2353|4990->2374|5019->2376|5037->2385|5079->2406|5139->2439|5161->2452|5229->2499|5362->2605|5446->2680|5486->2682|5535->2704|5550->2710|5685->2835|5726->2837|5779->2862|6241->3293|6290->3311|6333->3326|6602->3568|6620->3577|6672->3607|6811->3719|6854->3753|6905->3766|6954->3787|7092->3898|7152->3936|7254->4011|7313->4048|7413->4121|7471->4157|7576->4235|7638->4275|7739->4349|7809->4397|7905->4466|7958->4498|8057->4570|8111->4602|8260->4736|8289->4737|8345->4766|8393->4805|8445->4819|8502->4848|8645->4964|8722->5025|8762->5027|8827->5064|8898->5108|9000->5188|9065->5225|9137->5266|9194->5295|9322->5396|9370->5435|9422->5449|9483->5483|9560->5544|9600->5546|9665->5584|9715->5625|9755->5627|9824->5669|10237->6069|10251->6074|10291->6075|10361->6117|10784->6518|10854->6556|10920->6590|10974->6615|11099->6712|11177->6773|11218->6775|11277->6806|11328->6847|11369->6849|11431->6883|11573->7002|11624->7034|11638->7039|11678->7040|11740->7074|11879->7190|11942->7221|12005->7252|12060->7278|12119->7305|12173->7331|12222->7370|12275->7384|12334->7414|12438->7490|12516->7551|12557->7553|12623->7590|12695->7634|12788->7704|12854->7741|12927->7782|12989->7815|13128->7926|13206->7987|13247->7989|13313->8026|13385->8070|13480->8142|13546->8179|13619->8220|13677->8249|13815->8359|13893->8420|13934->8422|14000->8459|14076->8507|14170->8578|14240->8616|14276->8623|14454->8773|14532->8834|14573->8836|14639->8873|14715->8921|14813->8996|14883->9034|14919->9041|15098->9192|15176->9253|15217->9255|15283->9292|15359->9340|15458->9416|15528->9454|15564->9461|15662->9527|15717->9553|15774->9578|15824->9599|15953->9700|16006->9743|16060->9758|16111->9866|16162->9967|16212->9996|16263->10106|16314->10215|16364->10244|16415->10356|16466->10467|16517->10489|16594->10538|16613->10547|16657->10568|16752->10635|16771->10644|16810->10661|16845->10683|16895->10704|16998->10779|17017->10788|17062->10810|17161->10881|17180->10890|17223->10911|17258->10933|17308->10954|17412->11030|17431->11039|17477->11062|17577->11134|17596->11143|17640->11165|17675->11187|17727->11207|17773->11224|17879->11302|17928->11341|17981->11355|18031->11376|18127->11444|18205->11505|18246->11507|18300->11533|18351->11574|18392->11576|18450->11606|18606->11739|18652->11766|18666->11771|18706->11772|18764->11802|18913->11928|18972->11955|19026->11977|19080->12002|19234->12128|19312->12189|19353->12191|19411->12220|19475->12256|19666->12424|19724->12453|19789->12486|19839->12507|19988->12628|20066->12689|20107->12691|20165->12720|20230->12757|20329->12833|20387->12862|20452->12895|20502->12916|20657->13043|20735->13104|20776->13106|20834->13135|20898->13171|21003->13253|21061->13282|21126->13315|21176->13336|21332->13464|21410->13525|21451->13527|21509->13556|21573->13592|21679->13675|21737->13704|21802->13737|21852->13758|21998->13876|22076->13937|22117->13939|22175->13968|22239->14004|22336->14078|22394->14107|22459->14140|22509->14161|22563->14183|22609->14200|22885->14495|22935->14517|22984->14556|23040->14573|23094->14598|23146->14622|23177->14631|23267->14693|23346->14750|23400->14775|23481->14828|23512->14837|23592->14889|23662->14937|23716->14962|23768->14986|23799->14995|23883->15051|23957->15103|24011->15128|24063->15152|24094->15161|24175->15214|24245->15262|24299->15284|24349->15306|24404->15351|24466->15374|24520->15399|24573->15424|24604->15433|24681->15482|24754->15533|24809->15559|24861->15583|24892->15592|24977->15649|25060->15710|25114->15732|25164->15754|25244->15817|25284->15818|25338->15843|25466->15943|25561->16015|25626->16048|25676->16070|25735->16119|25775->16120|25829->16145|25948->16236|26019->16290|26060->16292|26118->16322|26183->16377|26241->16395|26303->16428|26397->16494|26460->16547|26501->16549|26573->16592|26696->16687|26719->16699|26750->16707|26781->16708|26904->16803|26926->16815|26974->16841|27163->17001|27186->17013|27226->17030|27288->17073|27302->17078|27342->17079|27410->17118|27529->17209|27552->17221|27583->17229|27662->17280|27684->17292|27732->17318|27800->17357|27872->17397|27934->17430|28002->17466|28060->17492|28115->17515|28163->17534|28269->17612|28325->17658|28366->17660|28416->17682|28510->17759|28552->17761|28606->17786|28685->17837|28710->17840|28758->17860|28783->17863|28866->17918|28897->17927|28967->17969|29084->18063|29138->18088|29220->18142|29251->18151|29325->18197|29444->18293|29498->18318|29580->18372|29611->18381|29685->18427|29806->18525|29860->18550|29942->18604|29973->18613|30046->18658|30166->18755|30220->18780|30302->18834|30333->18843|30406->18888|30526->18985|30580->19010|30662->19064|30693->19073|30767->19119|30888->19217|30942->19242|31025->19297|31056->19306|31130->19352|31251->19450|31305->19475|31387->19529|31418->19538|31494->19586|31615->19684|31669->19709|31752->19764|31783->19773|31868->19830|31999->19938|32053->19963|32172->20050|32210->20069|32224->20074|32264->20075|32314->20096|32369->20123|32509->20252|32550->20253|32604->20278|32653->20299|32672->20308|32745->20358|32794->20378|32814->20387|32887->20437|32918->20438|32977->20465|33027->20486|33081->20512|33112->20521|33178->20559|33289->20647|33339->20668|33418->20719|33449->20728|33517->20768|33630->20858|33680->20879|33760->20931|33791->20940|33857->20978|33972->21070|34022->21091|34102->21143|34133->21152|34202->21193|34316->21284|34366->21305|34446->21357|34477->21366|34546->21407|34660->21498|34710->21519|34790->21571|34821->21580|34891->21622|35006->21714|35056->21735|35136->21787|35167->21796|35239->21840|35354->21932|35404->21953|35483->22004|35514->22013|35584->22055|35699->22147|35749->22168|35829->22220|35860->22229|35941->22282|36066->22384|36116->22405|36198->22455|36246->22474|36356->22592|36406->22614|36476->22667|36517->22669|36571->22694|36668->22763|36693->22766|36784->22829|36874->22897|36928->22922|36986->22948|37033->22966|37101->23006|37150->23045|37191->23047|37237->23064|37425->23224|37488->23270|37529->23272|37579->23293|37618->23304|37644->23320|37694->23348|37774->23400|37800->23416|37851->23445|37905->23467|37952->23485|38004->23505|38047->23519|38768->24209|38801->24211
                  LINES: 28->1|35->7|36->8|37->9|38->10|39->11|40->12|41->13|42->15|43->17|44->18|45->20|46->21|47->22|49->27|49->27|51->27|52->28|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|55->32|55->32|57->32|58->33|58->33|58->33|58->33|59->34|59->34|59->34|60->25|60->25|60->38|60->38|61->6|62->8|62->9|62->10|62->11|62->12|62->13|62->14|63->16|64->18|64->19|65->21|65->22|65->23|66->24|67->25|69->31|70->35|72->37|73->38|75->40|75->40|75->40|76->41|80->45|80->45|80->45|81->46|81->46|81->46|81->46|81->46|81->46|82->47|82->47|82->47|82->47|84->49|84->49|84->49|86->51|86->51|86->51|87->52|87->52|87->52|87->52|88->53|95->60|96->61|99->64|105->70|105->70|105->70|108->73|108->73|108->73|109->74|110->75|110->75|111->76|111->76|112->77|112->77|113->78|113->78|114->79|114->79|115->80|115->80|116->81|116->81|119->84|119->84|120->85|120->85|120->85|121->86|123->88|123->88|123->88|124->89|125->90|125->90|126->91|127->92|128->93|131->96|131->96|131->96|132->97|132->97|132->97|133->98|133->98|133->98|134->99|139->104|139->104|139->104|140->105|145->110|146->111|147->112|148->113|151->116|151->116|151->116|153->118|153->118|153->118|154->119|154->119|156->121|156->121|156->121|157->122|157->122|159->124|161->126|163->128|165->130|166->131|166->131|166->131|168->133|169->134|169->134|169->134|170->135|171->136|171->136|172->137|173->138|174->139|177->142|177->142|177->142|178->143|179->144|179->144|180->145|181->146|182->147|185->150|185->150|185->150|186->151|187->152|187->152|188->153|188->153|192->157|192->157|192->157|193->158|194->159|194->159|195->160|195->160|199->164|199->164|199->164|200->165|201->166|201->166|202->167|202->167|204->169|206->171|208->173|209->174|212->177|212->177|212->177|213->178|214->179|215->180|216->181|217->182|218->183|219->184|220->185|222->187|222->187|222->187|222->187|223->188|223->188|223->188|223->188|224->189|225->190|225->190|225->190|226->191|226->191|226->191|226->191|227->192|228->193|228->193|228->193|229->194|229->194|229->194|229->194|232->197|233->198|236->201|236->201|236->201|237->202|238->203|238->203|238->203|239->204|239->204|239->204|240->205|240->205|241->206|241->206|241->206|242->207|242->207|244->209|245->210|246->211|250->215|250->215|250->215|251->216|252->217|252->217|253->218|254->219|255->220|258->223|258->223|258->223|259->224|260->225|260->225|261->226|262->227|263->228|266->231|266->231|266->231|267->232|268->233|268->233|269->234|270->235|271->236|274->239|274->239|274->239|275->240|276->241|276->241|277->242|278->243|279->244|282->247|282->247|282->247|283->248|284->249|284->249|285->250|286->251|287->252|288->253|289->254|298->263|299->264|299->264|299->264|300->265|300->265|300->265|301->266|301->266|302->267|303->268|303->268|304->269|304->269|305->270|305->270|305->270|306->271|306->271|307->272|307->272|307->272|308->273|308->273|309->274|310->275|310->275|310->275|311->276|311->276|311->276|312->277|312->277|314->279|314->279|314->279|315->280|315->280|316->281|317->282|317->282|317->282|318->283|319->284|319->284|320->285|321->286|321->286|321->286|322->287|324->289|324->289|324->289|325->290|325->290|325->290|326->291|327->292|327->292|327->292|328->293|329->294|329->294|329->294|329->294|330->295|330->295|330->295|332->297|332->297|332->297|333->298|333->298|333->298|334->299|335->300|335->300|335->300|336->301|336->301|336->301|337->302|338->303|339->304|340->305|341->306|343->308|346->311|348->313|348->313|348->313|349->314|349->314|349->314|350->315|351->316|351->316|351->316|351->316|352->317|352->317|353->318|353->318|354->319|355->320|355->320|356->321|356->321|357->322|358->323|358->323|359->324|359->324|360->325|361->326|361->326|362->327|362->327|363->328|364->329|364->329|365->330|365->330|366->331|367->332|367->332|368->333|368->333|369->334|371->336|371->336|372->337|372->337|373->338|374->339|374->339|375->340|375->340|376->341|378->343|378->343|379->344|379->344|380->345|384->349|385->350|385->350|385->350|386->351|387->352|387->352|387->352|388->353|388->353|388->353|388->353|388->353|388->353|388->353|388->353|389->354|390->355|390->355|390->355|391->356|391->356|392->357|393->358|393->358|394->359|394->359|395->360|397->362|397->362|398->363|398->363|399->364|401->366|401->366|402->367|402->367|403->368|405->370|405->370|406->371|406->371|407->372|409->374|409->374|410->375|410->375|411->376|413->378|413->378|414->379|414->379|415->380|416->381|416->381|417->382|417->382|418->383|420->385|420->385|421->386|421->386|422->387|425->390|428->393|431->396|432->397|432->397|432->397|433->398|434->399|434->399|436->401|436->401|437->402|438->403|440->405|443->408|443->408|443->408|444->409|448->413|448->413|448->413|449->414|449->414|449->414|449->414|450->415|450->415|450->415|451->416|453->418|454->419|456->421|473->438|474->439
                  -- GENERATED --
              */
          