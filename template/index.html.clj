;; Define template options here
; @layout  default
; @title   home

(defn experience [name url location title date duties]
  [:li
   {:style "margin-top: 10px;"}
   [:strong [:a {:href url} name]] " - " location
   [:p (str title ", " date)]
   [:ul
    (for [duty duties] [:li duty])]])

(section :main "main"
  ;; Resume
  [:h2 [:i.icon-fire] " About Me"]
    [:p
      [:strong "Name: "] "Timothy Yejong Hahn"]
    [:p
      [:strong "Location: "] "Philadelphia, PA"]

  [:br]
  [:h3 [:i.icon-pencil] " Education" ]
    [:p "Drexel University, Philadelphia, PA"]
    [:p "Bachelors of Science in Computer Science, June 2014"]

  [:br]
  [:h3 [:i.icon-road] " Experience"]
  [:br]
  [:ul {:style "padding-left: 20px;"}
    (experience "Hewlett-Packard" 
                 "http://hp.com" 
                 "Wayne, PA" 
                 "Linux Developer" 
                 "September 2011 to August 2013"
                 ["Developed QT applications designed to be lightweight and bloatfree to replace basic operating system requirements (e.g. a text editor)"
                  "Debugged desktop and embedded applications for both the x86 and ARM architectures"
                  "Enhanced and added to existing Thin Client software"
                  " Tested various RDP, ICA, Citrix, and Xen connections"])

     (experience "The Math Forum at Drexel"
                 "http://mathforum.org"
                 "Philadelphia, PA"
                 "Grails Developer"
                 "July 2011 to September 2011"
                 ["Improved and aided development on an existing Grails project that organized events"
                  "Integrated current projects with LDAP"
                  "Aided coworkers working with JQuery Mobile"
                  "Built tools for the Math Forum using the Grails and Spring platforms"])

     (experience "Drexel College of Medicine"
                 "http://www.drexelmed.edu/"
                 "Philadelphia, PA"
                 "Web Developer"
                 "September 2010 to March 2011"
                 ["Created new internal project management system in VB and ASP.NET"
                  "Served as a front line of support for students at the College of Medicine"
                  "Developed a face recognition software that reported data back to an Adobe Flash application using C and ActionScript 3.0"
                  "Designed new websites needed for classes and for different departments at the College of Medicine "
                  "Adapted existing web applications for mobile use (focusing on iOS, Android, and BlackBerry specifications)"])
     
     (experience "Magview"
                 "http://www.magview.com/"
                 "Burtonsville, MD"
                 "Desktop Development"
                 "June 2010 to September 2010"
                 ["Migrated and rewrote mammography tools from VisualFoxPro to a .NET and TSQL standard"
                  "Reverse engineered existing solutions and built ActiveX controls to ensure software was viable for both older machines and newer machines"
                  "Created a new tool to help mammogram technicians and radiologists communicate results of a scan to the referring physician"
                  "Updated an internal communication web application using C# and ASP.NET"])
     (experience "Goodwin College of Professional Studies"
                 "http://goodwin.drexel.edu"
                 "Philadelphia, PA"
                 "Lab Assistant"
                 "December 2009 to May 2010"
                 ["Organized and deployed hard drive images to classroom computers over the network"
                  "Maintained the network and servers (Windows Server 2003)"
                  "Cloned images and drives to provide students with optimal tools and settings, organized hardware, etc"])]
    [:br]
    [:h3 [:i.icon-cogs] " Programming Languages"]

    [:ul
     [:li
      [:p
       [:strong
        [:em "Professional Experience: "]] "C, C++, Java, Perl, bash, ASP.NET(VB and C#), Grails"]]
     [:li
      [:p
       [:strong
        [:em "High Familiarity: "]] "Python, Clojure, Ruby, JavaScript (Vanilla and jQuery), CSS"]]]
)
