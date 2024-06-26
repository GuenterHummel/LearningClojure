(ns firstcl.core
  (:gen-class))

(def users {"kyle" {:password "secretk" :number-pets 2}
            "siva" {:password "secrets" :number-pets 4}
            "rob" {:password "secretr" :number-pets 6}
            "george" {:password "secretg" :number-pets 8}})

(defn check-login [username password]
  (let [actual-password ((users username) :password)]
    (= actual-password password)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!")
  (.println System/out args)
  (.println System/out "Hi")
  (println "LOGIN OK ? <" "George" "> :" (check-login "george" "secretg"))
  (println "LOGIN OK ? <" "Siva" "  > :" (check-login "siva" "secretg")))

