(ns status-im.ui.screens.profile.ttt.styles
  (:require [status-im.ui.components.colors :as colors]
            [status-im.ui.components.styles :as common.styles]))

(def intro-container
  {:flex              1
   :align-items       :center
   :justify-content   :space-between
   :margin-horizontal 32})

(def intro-image
  {:padding-bottom 10
   :align-items    :center})

(def intro-text
  {:text-align     :center
   :font-size      22
   :color          colors/black
   :font-weight    :bold
   :line-height    28
   :letter-spacing -0.3})

(def description-label
  {:margin-top     8
   :line-height    21
   :text-align     :center
   :color          colors/gray})

(def intro-button
  {:flex-direction :row
   :margin-top     48
   :margin-bottom 24})

(def step-n
  {:margin-top 5
   :font-size  14
   :text-align :center
   :color      colors/gray})

(def tribute-to-talk
  {:font-weight    :bold
   :font-size      15
   :letter-spacing -0.2
   :text-align     :center})

(def ttt-container
  (merge
   common.styles/flex
   {:background-color colors/white}))

(def number-container
  {:width 64
   :height 64
   :border-radius 32
   :margin-horizontal 16
   :margin-vertical 12
   :justify-content :center
   :align-items :center
   :background-color colors/blue-light})

(def number
  {:line-height 28
   :font-size 22
   :color colors/blue})

(def snt-amount-container
  {:margin-horizontal 40
   :flex 1
   :margin-top 24
   :margin-bottom 40
   :justify-content :flex-start
   :align-items :center})

(def snt-amount
  {:font-size 32
   :color colors/black})

(def snt-amount-label
  (assoc snt-amount :color colors/gray))

(def personalized-message-input
  {:border-radius 8
   :background-color colors/gray-lighter
   :padding-horizontal 16
   :padding-vertical  17})

(def finish-label
  {:font-size 22
   :color colors/black})

(defn finish-circle [color radius]
  {:background-color color
   :width (* 2 radius)
   :height (* 2 radius)
   :border-radius radius
   :justify-content :center
   :align-items :center})
