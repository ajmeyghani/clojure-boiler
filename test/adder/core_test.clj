(ns adder.core-test
  (:require [clojure.test :refer :all]
            [adder.core :refer :all]))


(deftest test-sum
  (is (= 5 (sum 3 2)), "should add two numbers"))
