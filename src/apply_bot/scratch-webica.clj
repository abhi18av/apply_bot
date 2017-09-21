(ns user
  (:require [clojure.string :as string]
            [clojure.test :refer [deftest testing is]]
            [webica.core :as webica :refer [sleep]]
            [webica.by :as by]
            [webica.chrome-driver :as chrome]
            [webica.remote-web-driver :as browser]
            [webica.web-driver :as driver]
            [webica.web-driver-wait :as wait]
            [webica.web-element :as element]))

<<<<<<< HEAD:src/apply_bot/scratch.clj
=======


(browser/show-functions)
>>>>>>> 34a8f6fb4f69555f083b158b3ec9525a5c4736a0:src/apply_bot/scratch-webica.clj


<<<<<<< HEAD:src/apply_bot/scratch.clj
(require '[sparkledriver.browser :refer [with-browser make-browser fetch!]])
(require '[sparkledriver.element :refer [find-by-xpath* text]])

=======
(webica/selenium-classes )

(chrome/location)
>>>>>>> 34a8f6fb4f69555f083b158b3ec9525a5c4736a0:src/apply_bot/scratch-webica.clj


<<<<<<< HEAD:src/apply_bot/scratch.clj
(with-browser [browser (make-browser :headless false)]
  (-> (fetch! browser "http://clojure.org")
      (find-by-xpath* "//div[@class='clj-intro-message']/p")
      (nth 2)
      text))
=======
(element/)

(driver/)

(by/)
>>>>>>> 34a8f6fb4f69555f083b158b3ec9525a5c4736a0:src/apply_bot/scratch-webica.clj


(defn cheese []
  (browser/get "http://www.google.com")
  (let [q (browser/find-element (by/name "q"))]
    (element/send-keys q "Cheese!")
    (element/submit q)
    (wait/until (wait/instance 10)
                (wait/condition
                 (fn [driver]
                   (string/starts-with?
                    (string/lower-case (driver/get-title driver))
                    "cheese!"))))
    (webica/sleep 2)
    (browser/get-title)))


<<<<<<< HEAD:src/apply_bot/scratch.clj
=======
(let [_ (chrome/start-chrome)
      title (cheese)]
;  (browser/quit)
  title)
>>>>>>> 34a8f6fb4f69555f083b158b3ec9525a5c4736a0:src/apply_bot/scratch-webica.clj


(chrome/get "http://www.google.com")

(def q (browser/find-element (by/name "q")))

<<<<<<< HEAD:src/apply_bot/scratch.clj
(element/send-keys q "This is being controlled by the browser")



(let [_ (chrome/start-chrome)
title (cheese)]
;(browser/quit)
  title
  )


(chrome/location)
(first (chrome/find-elements-by-css-selector "._NId"))

;;;; PLAYING WITH CHROME NOW



(w/selenium-classes)

=======
(let [_ (firefox/start-firefox)
      title (cheese)]
;  (browser/quit)
  title)


>>>>>>> 34a8f6fb4f69555f083b158b3ec9525a5c4736a0:src/apply_bot/scratch-webica.clj
