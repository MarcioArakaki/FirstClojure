(defn greetings [name]
    (str "Hello " name "!"))

(greetings "Clojure")

(if true
    (do (println "Thor")
    "By Zeus's hammer!")
    "By Aquaman's trident!")

(or true nil :large_I_mean_venti :why_cant_I_just_say_large)