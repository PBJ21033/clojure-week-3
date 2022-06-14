(defn decode-prime-list
    ([elements] (decode-prime-list elements 2 nil)) ;; 2 nil means 2 is false since nil automatically evaluates to false.
    ([elements count storage]
    (let [beginning (first elements) ;; let allows you to use the if statements else where. Allows you to not have to use cond.
        incr (if (= beginning 0) 1 beginning)
        prepended-storage
        (if (= beginning 1)
            (conj storage count) ;; puts the counter in the list.
            storage)]
    (if (empty? (rest elements))
        (reverse prepended-storage) ;; reverses the order of the storage.
        (recur (rest elements)(+ incr count) prepended-storage)) ;; recursion.
        ))
)
(defn -main[]
  (def primes '(2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97))
  (def rleprimes '(1 1 0 1 0 1 3 1 0 1 3 1 0 1 3 1 5 1 0 1 5 1 3 1 0 1 3 1 5 1 5 1 0 1 5 1 3 1 0 1 5 1 3 1 5 1 7 1 3))

  ;; Decodes the rleprimes.
  (println "Encrypted: "rleprimes)
  (println "Unencrypted:")
  (println (decode-prime-list rleprimes))
  ;; sees if primes and rleprimes are the same or not. If not then it will be false. If so then it will be true.
  ;;(println (= primes (decode-prime-list rleprimes)))
)