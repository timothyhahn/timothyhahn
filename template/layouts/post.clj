; @layout  default
; @title   post default title

(section :main
 ; page header
 [:div.page-header
  ; post title
  (hd (:title site))
  ; post date
  (post-date)]
  ; post tags
  (post-tags)
  [:hr]
  ; contents
  [:div contents]
  [:hr]

  ; previous/next post
  (prev-next-post-link))

