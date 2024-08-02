(ns backpack.sequence)

(defn batches [coll n]
  (partition-all n coll))
