(defproject ring-tutorial "1.0.0-SNAPSHOT"
  :description "A Ring tutorial project"
  :dependencies
    [[org.clojure/clojure "1.6.0"]
     [ring/ring-core "1.3.2"]
     [ring/ring-jetty-adapter "1.3.2"]]
  :profiles {:dev {:dependencies [[ring/ring-devel "1.3.2"]]}})
