+ task
+ microtask

multiple task sources which guarantees execution order within that source,
but the browser gets to pick which source to take a task from on each trun of the loop.

Between tasks, the browser may render updates.

click
promise
click
promise
timeout
timeout
mutate
mutate

event loop 好文
https://jakearchibald.com/2015/tasks-microtasks-queues-and-schedules/
