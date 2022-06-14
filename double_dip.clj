(defn cartesian-product
    ([] '(()))
    ([xs & more]
    (mapcat #(map (partial cons %)
                    (apply cartesian-product more))
            xs)))
;; To be used in our main function.
(def flavors_one ["Vanilla" "Chocolate" "Cherry Ripple"])

;; To be used in our main function.
(def flavors_two ["Lemon" "Butterscotch" "Licorice Ripple"])

;; To be used in our main function.
;; This combines the two lists so that we can get all possible combinations with one flavor.
(def combined_flavors (concat flavors_one flavors_two))

(defn -main[]

;; Task 1
    (println "Task 1: Two lists with chocolate in each one.")
    (println
        (filter
        #(=(first %) "Chocolate") ;; When you put in a 1, it is invalid since only one parameter is being passed. 
        (cartesian-product flavors_one flavors_two))
    )
    (newline)

;; Task 2
    (println "Task 2: 1 list with chocolate in first and last.")
    (println
        (filter
        #(or (= (first %) "Chocolate")(= (last %) "Chocolate"))
        ;; gives all of the possible flavor combinations with chocolate.
        (cartesian-product combined_flavors combined_flavors))
    )
)