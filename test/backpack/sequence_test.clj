(ns backpack.sequence-test
  (:require [clojure.test :refer :all]
            [backpack.sequence :refer :all]))

(deftest batches-test
  (is (= [[0 1] [2 3] [4 5] [6 7] [8 9] [10]]
         (batches (range 11) 2)))
  (is (= [[0 1 2 3 4 5 6 7 8 9] [10]]
         (batches (range 11) 10)))
  (is (= [[0 1 2 3 4 5 6 7 8 9 10]]
         (batches (range 11) 11)))
  (is (= []
         (batches [] 2))))
