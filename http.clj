(ns http)

;; add dep to deps.edn

(require '[clj-http.client :as client])

(client/get "https://ipinfo.io")
