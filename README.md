# location


## PUT avec curl

```
curl --header "Content-Type: application/json" \              
--request PUT \
--data '{"debut":"1/9/2025","fin":"2/9/2025"}' \
"http://localhost:8080/cars/AA11BB?rent=true"
```