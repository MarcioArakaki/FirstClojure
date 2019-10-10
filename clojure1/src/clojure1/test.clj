(defn greetings [name]
    (str "Hello " name "!"))

(greetings "Clojure")

(if true
    (do (println "Thor")
    "By Zeus's hammer!")
    "By Aquaman's trident!")

;;or => first truthy value
(or false nil :why_cant_I_just_say_large :large_I_mean_venti )

;; or => last value
(or (= 0 1) (= "ye" "no"))

;; and => first falsy value or last trthly value
(and :free_wifi :hot_coffee)

(and :feelin_super_cool nil false)
; => nil

{:first-name "Charlie"
 :last-name "McFish"}
(hash-map :key 6 :key2 10)

;get gets values in map
(get {:a "Drow" :b "lina"} :a)
(get {:a "Drow" :b "lina"} :b)
(get {:a "Drow" :b {:c "Prophet"}} :b)
(get {:a "Drow" :b {:c "Prophet"}} :c "Techies")
(get-in {:a "Drow" :b {:c "Prophet"}} [:b :c])

;treat the map like a function with the key as its argument
({:hero "Troll Warlord"} :hero)

;keywords can be used like functions too
(:player {:hero "Abbadon" :skill "Dream coil" :item "Daedalus"} "The Noob")

;list use '
'(6 6 6 7)

(nth '(1 2 3 5 8 13) 4)

;hash-set sorted-set
#{"kurt vonnegut" 20 :icicle}

(hash-set 1 1 2 3 5 8 13 21 34)

;(conj #{1 1 2 3 5} 5)

(contains? #{1 2 3 5} 3)
(contains? #{1 2 3 5} 6)
(contains? #{nil} nil)


(:1 #{:1 2 3 5})
(get #{:1 2 3 5} :1)
(get #{:1 2 3 5} 6)
(get #{:1 2 3 5 nil} nil)

;Functions
(or + -)
((or + -) 1 2 3)
((and (= 1 1) *)1 2 4)

;Higher-order functions => have functions as arguments or as return
(inc 1.75)
(map inc [1 2 3 4 5 6])

(+ (inc 199) (/ 100 (- 7 2)))
(+ 200 (/ 100 (- 7 2))); evaluated (inc 199)
(+ 200 (/ 100 5)); evaluated (- 7 2) = 5
(+ 200 20); evaluated (/ 100 5)

(+ (inc 199) (/ 100 (- 7 (+ 2 3))))

;Special Forms don't always evaluate all of their operands

