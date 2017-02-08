(set-env!
  :source-paths #{"src"}
  :resource-paths #{"resources"}
  :dependencies '[[org.clojure/clojure "1.7.0"]
                  [adzerk/bootlaces "0.1.13" :scope "test"]
                  [clj-aws-s3 "0.3.10"]
                  [pandect "0.5.4"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.1.2")
(bootlaces! +version+)

(task-options!
 push {:gpg-sign false}
 pom {:project      'adstage/boot-s3
      :version      +version+
      :repositories [["clojars"  {:url           "https://clojars.org/repo"
                                  :creds         :gpg
                                  :sign-releases false}]]
      :description  "Boot task for syncing local directory with AWS S3 bucket"
      :url          "https://github.com/adstage/boot-s3"
      :scm          {:url "https://github.com/adstage/boot-s3"}
      :license      {"name" "Eclipse Public License"
                     "url"  "http://www.eclipse.org/legal/epl-v10.html"}})

(deftask dev
  "Dev process"
  []
  (comp
    (watch)
    (pom)
    (jar)
    (install)))
