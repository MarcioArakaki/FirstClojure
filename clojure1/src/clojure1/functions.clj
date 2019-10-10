;FUNCTIONS !!

;defn
;function name
;A docstring describing the function (optional)
;Parameters listed in brackets
;Function body

(defn too-enthusiastic
    "Return a cheer that might bee too enthusiastic"
    [name]
    (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
        "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE")
)

(too-enthusiastic "Zelda")

; (defn multi-arity
;   ([first-arg second-arg third-arg]
;     (do-things first-arg second-arg third-arg))
;   ([first-arg second-arg]
;     (do-things first-arg second-arg))
;   ([first-arg]
;     (do-things first-arg))
; )


;Multiple arity (arguments) function definition
;No args can be used for default 

(defn x-chop
  ([name chop-type]
    (str "I " chop-type " chop " name "! Take that!"))
  ([name]
    (x-chop name "karate"))
)

(x-chop "JoJo" "Kung-fu")
(x-chop "JoJo")

;variable-arity (multi parameters)
; called rest parameter (&)

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))

(defn codger
  [& whippersnapper]
  (map codger-communication whippersnapper)
)

(codger "Satanas" "Devil" "Lucifer" "Belzebub")

(defn hero-and-kills
    "The hero that is killing and the heroes killed"
    [hero & kills]
    (str hero " killed "
        (clojure.string/join ", " kills) " with a headshot"))
(hero-and-kills "Widowmaker" "Doomfist" "Hanzo" "Genji" "Tracer")    

;Destructing naming infinity parameters

(defn my-first
    [[first-thing]]
    first-thing)
(my-first ["oven" "bike" "door"])

(defn article-author
    [[DidEverything DidSomething Professor & DidNothing]]
    (str "The authors of The useless paper: the real author " DidEverything 
        ", the friend that helped " DidSomething ", The professor who did nothing " Professor
        " and that bunch of people who did literally nothing " 
        (clojure.string/join ", " DidNothing)))

(article-author ["Einstein" "Nilton" "Archimedes" "Hawking" "Pascal" "Rutherford"])

(defn announce-treasure-location
    [{lat :lat COULDBEANYTHING :lng}]
    (println (str "Treasure lat: " lat))
    (println (str "Treasure lng: " COULDBEANYTHING)))

(announce-treasure-location {:lat 22 :lng 55})

;{keys [key key]} to break the key word out of the map avoiding having to repeat the key name
(defn announce-treasure-location
    [{:keys [lat lng]}]
    (println (str "Treasure lat: " lat))
    (println (str "Treasure lng: " lng)))

(announce-treasure-location {:lat 22 :lng 55})

; (defn receive-treasure-location
;     [{:keys [lat lng] :as treasure-location}]
;     (println (str "Treasure lat: " lat))
;     (println (str "Treasure lng: " lng))
  
; ;; One would assume that this would put in new coordinates for your ship
; (steer-ship! treasure-location))

; Function Body

;The function body can contain forms of any kind. The last one is returned
(defn illustrative-function
    []
    (+ 1 304)
    30
    "JoJo")

(illustrative-function)

(defn number-comment
    [number]
    (if (> number 6)
    "OMG!! What a enormous number"
    "Meh"))
(number-comment 7)
(number-comment 5)


