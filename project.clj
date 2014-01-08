(defproject yieldbot/flambo "0.1.0-SNAPSHOT"
  :description "A Clojure DSL for Apache Spark"
  :url "https://github.com/yieldbot/flambo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [com.esotericsoftware.kryo/kryo "2.21"]
                 [yieldbot/serializable-fn "0.0.3-SNAPSHOT"]
                 [com.twitter/carbonite "1.3.3-SNAPSHOT"]
                 [com.twitter/chill_2.9.3 "0.3.5"]]
  :profiles {:provided
             {:dependencies
              [[org.apache.spark/spark-core_2.9.3 "0.8.1-incubating"]]}}
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-options ["-source" "1.6" "-target" "1.6"]
  ;; :jvm-opts ["-Dspark.serializer=org.apache.spark.serializer.KryoSerializer"
  ;;            "-Dspark.kryo.registrator" "flambo.kryo.FlamboRegistrator"]
  :aot [flambo.function])
