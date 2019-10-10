;Anonymous Functions (no names)

; (fn [param-list]
;     function body)

(map (fn [name] (str "Hi, " name)) ["Darth Vader" "Mr. Magoo"])

((fn [x] (* x 3)) 8)

; Clojure doesn't give a f*, you call def he will do def, even to a anon func
(def my-anonymous-func (fn [x] (* x 3)))
(my-anonymous-func 3)

; Compact VERSION anon
#(* % 3)

(#(* % 3) 4)

(map #(str "Hi, " %) ["Dio" "Gilgamesh"])

;; Function call
(* 8 3)

;; Anonymous function
#(* % 3)

;; %n are the parameters of anonymous funtions
(#(str %1 " and " %2) "cornbread" "butter beans")

;; rest parameter
;; identity does nothing, simply returns the arguments in a list
(#(identity %&) 1 "blarg" :yip)

;; RETURNING FUNCTIONS

(defn inc-maker
    "Create a custom incrementator"
    [inc-by]
    #(+ % inc-by))

(def inc3 (inc-maker 3))
;;(inc-maker 3) => returns a funcion: #(+ % 3)
(inc3 7)