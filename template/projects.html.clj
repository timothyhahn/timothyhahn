;; Define template options here
; @layout  default
; @title   home

(defn project 
  [name tags links description] 
    [:div {:class "project"}
      [:hr]
      [:h3 {:class "project-name"} name]  [:span.project-tags "Uses:" (for [tag tags] (str " " tag))]
      [:blockquote {:class "project-description"} description]
      [:ul {:class "project-links"} [:h4 "Links"] (for [link links] 
        [:li [:a {:href link} link]])]])

(section :main
  ;; Projects
  (hd "Projects")

  (project "Where at Drexel?" 
           ["Python" "Javascript" "Knockout.js" "PostgreSQL"]
           ["http://whereatdrexel.com/" "https://github.com/timothyhahn/whereatdrexel-backend" "https://github.com/maddchickenz/whereatdrexel-webapp"] 
           "A map of Drexel University's main campus with the ability to search for locations and click on significant markers around the campus.")

  (project "Inquizition!"
          ["Python" "Java" "Javascript" "Backbone.js" "PostgreSQL"] 
          ["http://inquizition.herokuapp.com/" "https://github.com/timothyhahn/inquizition-web" "https://github.com/timothyhahn/inquizition-android"] 
           "A competitive multi-choice trivia quiz service, web application, and Android application.")
    
  (project "clj-tictactoe"
           ["Clojure"]
           ["https://github.com/timothyhahn/clj-tictactoe"]
           "A game of tic-tac-toe written in Clojure. Has an AI, console version, and graphical version.")

  (project "DrexelEXP"
           ["Java" "SpringMVC" "MySQL"]
           ["https://github.com/timothyhahn/DrexelEXP"]
           "Web application for viewing Drexel professors and courses with the ability to rate combinations of both."))
  
