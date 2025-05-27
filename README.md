# Shop-Products
This is a small Java console application that models a simple inventory system for a store. It demonstrates key Java concepts and APIs:

Object-Oriented Design: abstract classes and subclasses

Collections & Maps: grouping products by category

Generics & Wildcards: type-safe utility methods and bulk operations

Lambda Expressions & Streams: filtering and sorting collections

Concurrency: processing orders in parallel using Runnable and Thread

You will implement the core domain classes (Produs, Carte, DVD, Categorie), the business logic (Magazin), a generic utility (Utility.schimbaPozitii), and a concurrent order processor (ProcesatorComenzi). A sample Main class ties everything together.
Abstract Product Model

Produs (abstract)

Carte (price = pages × pricePerPage)

DVD (price = duration × pricePerMinute)

Category & Inventory

Categorie with proper equals/hashCode

Magazin maintains Map<Categorie, List<Produs>>

Single- and bulk-add methods using generics and bounded wildcards

Stream-based filtering and sorting

Generic Utility

Utility.schimbaPozitii(List<T>, int i, int j) swaps any two elements

Concurrent Order Processing

ProcesatorComenzi implements Runnable

Two separate threads process different order lists concurrently
