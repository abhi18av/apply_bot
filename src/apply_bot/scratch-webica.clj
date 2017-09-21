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



(browser/show-functions)

(driver/show-functions)

(w/)

(chrome/quit)

(wait/)

(element/)

(driver/)

(by/)


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
    (w/sleep 2)
    (browser/get-title)))


(let [_ (chrome/start-chrome)
      title (cheese)]
  (browser/quit)
  title)




(let [_ (firefox/start-firefox)
      title (cheese)]
  (browser/quit)
  title)


