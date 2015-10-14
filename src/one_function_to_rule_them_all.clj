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
  (loop [acc []
         coll sorted-seq]
    (cond
      (empty? coll) (conj acc n)
      (< n (first coll)) (concat acc [n] coll)
      :else (recur (conj acc (first coll)) (rest coll)))))

(defn insertion-sort [a-seq]
  (reduce insert [] a-seq))

(defn toggle [a-set elem]
  (if (a-set elem)
    (disj a-set elem)
    (conj a-set elem)))

(defn parity [a-seq]
  (reduce (fn [acc elem]
            (toggle acc elem)) #{} a-seq))

(defn minus
  ([x]
   (minus 0 x))
  ([x y]
   (- x y)))

(defn count-params [& args]
  (reduce (fn [acc elem] (inc acc)) 0 args))

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
