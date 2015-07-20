(ns ods.prefix
  (:require [grafter.rdf :refer [prefixer]]
            [grafter.vocabularies.dcterms :refer [dcterms]]
            [grafter.vocabularies.dcat :refer [dcat]]))

(def base-domain (prefixer "http://public.opendatasoft.com/api/datasets/1.0/"))
(def base-graph (prefixer "http://public.opendatasoft.com/graph/"))
(def theme-id (prefixer "http://public.opendatasoft.com/id/theme/"))
(def theme-cs "http://public.opendatasoft.com/concept-scheme/themes")

(def catalog "http://public.opendatasoft.com/api/datasets/1.0/search?rows=-1&format=rdf")

(def dcterms:identifier (dcterms "identifier"))
(def dcterms:language (dcterms "language"))
(def dcat:keyword (dcat "keyword"))
(def dcat:Catalog (dcat "Catalog"))
(def dcat:dataset (dcat "dataset"))
(def lang (prefixer "http://id.loc.gov/vocabulary/iso639-1/"))
