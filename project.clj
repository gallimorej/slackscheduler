(defproject slackscheduler "0.1.0-SNAPSHOT"
  :description "A command line utility to schedule messages in a Slack workspace"
  :url "https://github.com/gallimorej/slackscheduler"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/data.json "0.2.6"]]

  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]]
  ;:hooks [environ.leiningen.hooks]
  :profiles {:production {:env {:production true}}
             :dev        {:plugins [[com.jakemccrary/lein-test-refresh "LATEST"]]}
             :uberjar    {:aot :all}}

  :main slackscheduler.core)
