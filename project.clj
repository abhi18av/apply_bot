(defproject apply_bot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [


                 ;; Browser automation - javaFX embedded browser
                 [sparkledriver "0.2.0"]


                 ;; Clojure layer over parenthesis
                 [webica "3.0.0-beta2-clj0"]



                 ;; For traversing the nested clojure data structure
                 [com.rpl/specter "1.0.3"]


                 ;; Utility for traversing CLJ(S) data structures
                 [medley "1.0.0"]


                 ;; Frozen clojure version
                 [org.clojure/clojure "1.9.0-alpha17"]

                 ;; Quickcheck
                 [org.clojure/test.check "0.10.0-alpha2"]


                 ;; Asynchronous stuff
                 [org.clojure/core.async "0.3.443"]


                 ;; Pattern matching in clojure
                 [org.clojure/core.match "0.3.0-alpha5"]


                 ;; MiniKanren
                 [org.clojure/core.logic "0.8.11"]


                 ;; Documentation using marginalia
                 [lein-marginalia "0.9.0"]


                 ;; API documenataion tool Codox
                 [lein-codox "0.10.3"]


                 ;; To store the temp data in interim EDN / JSON files
                 [com.cognitect/transit-clj "0.8.300"]


                 ]



  :main ^:skip-aot apply-bot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
