; @title  default title
; @format html5

[:head
 [:meta {:charset (:charset site)}]
 [:meta {:name    "viewport"
         :content "width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1"}]

 [:title
  (if (= (:title site) "home")
    (:site-title site)
    (str (:site-title site) " - " (:title site)))]

 [:link {:rel   "shortcut icon"
         :href  "/favicon.ico"}]
 [:link {:href  "/atom.xml"
         :rel   "alternate"
         :title (:title site)
         :type  "application/atom-xml"}]
 (absolute-css ["/css/prettify.css" (:css site ())])]
; /head

(defn hd [s] [:h1.title s])

(defn section [el cl & s] [el [:div {:class (str cl " glow shadow grid-66 center")} s]])

(defn em [s] [:em s])

(defn st [s] [:strong s])

(defn emst [s] (em (st s)))

[:body
 [:img {:class "bg" :src "/img/background.png"}]

 [:div.grid-container.center
  (section :header "header"
    [:h2 (:site-title site)]
    [:ul#menu-links 
     [:li [:a {:href "/"} "Home"]] 
     [:li [:a {:href "/posts.html"} "Posts"]]
     [:li [:a {:href "/projects.html"} "Projects"]]
     [:li [:a {:href "/atom.xml"} [:i.icon-rss]]]]

    [:div#out-links
      (link [:i.icon-github.icon-2x] (str "https://github.com/" (:github site)))
      (link [:i.icon-twitter.icon-2x] (str "http://twitter.com/" (:twitter site)))
      (link [:i.icon-headphones.icon-2x] (str "http://last.fm/user/" (:lastfm site)))])

  contents

  (section :footer "footer"
      "Copyright © 2013 Timothy Hahn"
      
      [:div#powered-by
       "Powered By " (link "Misaki" "http://liquidz.github.io/misaki/")])]
      ; /grid-container

 (absolute-js ["/js/prettify.js"
               "/js/lang-clj.js"
               "/js/jquery.min.js"
               "/js/jquery.timeago.js"
               (:js site ())])]
; /body
