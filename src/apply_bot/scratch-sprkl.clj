(ns user
  (:require [sparkledriver.browser :as sprkl-browser]
            [sparkledriver.element :as sprkl-element]
            [sparkledriver.cookies :as sprkl-cookies]
            [sparkledriver.retry :as sprkl-retry]))


;; sparkle-driver


(sprkl-browser/with-browser [browser (make-browser)]
  (-> (fetch! browser "http://clojure.org")
      (find-by-xpath* "//div[@class='clj-intro-message']/p")
      (nth 2)
      text))

