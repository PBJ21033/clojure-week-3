(defn binsearch [numlist target]
  (def uppercount (dec (count numlist))) ;; returns a count one less than count of numlist.
  (loop [lower 0
        upper uppercount]
    (if (> lower upper) nil
      (let [mid (quot (+ lower upper) 2)
            midvalue (nth numlist mid)]
        (cond
          (> midvalue target) (recur lower (dec mid))
          (< midvalue target) (recur (inc mid) upper)
          (= midvalue target) mid)))))
(def numlist [1 2 3 4 5 8 6])

(defn -main[]
    (println "found at index: " (binsearch numlist 5))
)