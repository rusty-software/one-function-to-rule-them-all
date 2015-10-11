(ns one-function-to-rule-them-all)

(defn concat-elements [a-seq]
  (reduce concat '() a-seq))

(defn str-cat [a-seq]
  (if (empty? a-seq)
    ""
    (reduce (fn [s elem] (str s " " elem)) a-seq)))

(defn my-interpose [x a-seq]
  (reduce (fn [acc elem]
            (if (empty? acc)
              (conj acc elem)
              (conj acc x elem))) [] a-seq))

(defn my-count [a-seq]
  (reduce (fn [acc elem] (inc acc)) 0 a-seq))

(defn my-reverse [a-seq]
  (reduce conj '() a-seq))

(defn min-max-element [a-seq]
  (reduce (fn [acc elem]
            (if (empty? acc)
              [elem elem]
              [(min (first acc) elem) (max (second acc) elem)])) [] a-seq))

(defn insert [sorted-seq n]
  (cond
    (empty? sorted-seq) [n]
    (= 1 (count sorted-seq)) (min-max-element (concat sorted-seq [n]))
    :else (loop [acc []
                 coll sorted-seq]
            (if (empty? coll)
              acc
              (if (< n (first coll))
                (concat acc [n] coll)
                (recur (concat acc [(first coll)]) (rest coll)))))))

(defn insertion-sort [a-seq]
  [:-])

(defn parity [a-seq]
  [:-])

(defn minus [x]
  :-)

(defn count-params [x]
  :-)

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
