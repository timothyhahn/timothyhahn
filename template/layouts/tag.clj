; @layout  default
; @title   tag default title

(section :main "main"
 ; page header
 [:div {:class "page-header"}
  [:h2 (:tag-name site)]]

 (ul #(link (:title %) (:url %))
     (:posts site)))

