# Node.js Stream

- A stream is an abstract interface for working with streaming data in Node.js
- The node:stream module provides an API for implementing the stream interface.
- Streams can be readable,writable,or both.
- The node:stream module is useful for creating new types of stream instance.

## Types of stream

- Writable
- Readable
- Duplex
- Transform

## Object mode

## Buffering

Both Writable and Readable streams will **store data in an internal buffer**.

- Data is buffered in Readable streams **when the implementation calls `stream.push(chunk)`**.



