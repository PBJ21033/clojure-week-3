;; This is to solve for GCD with recursion.
(defn gcd-recursive [a b]
    (if(zero? b)
        a
        (recur b (mod a b)))
)

;; This is the instrumented function for GCD.
(defn gcd-instrumented [a b]
    (if(zero? b)
        a
        (do
        ;; the quot rounds a/b close to zero to the nearest integer. Where just dividing isn't as precise.
        ;; The rem gives the remainer of a/b which then we add to the nearest integer to a/b.
        (println a '= b(list(quot a b)) ' + (rem a b))
        (recur b (mod a b)))
    )
)