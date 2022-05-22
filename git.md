about version control
=====================

version control is a system that records changes to a file(any type of file) or a set of files over time so that you can recall specific versions later.

## types

### Local Version Control Systems(VCSs)

+ copy files into another directory. 
+ local VCSs that had a simple databases that kept all the changes to files under version control.

### Centralized Version Control Systems(CVCSs)

+ reason: need to collaborate with others
+ these systems have a single server that contains all the versioned files,and a number of clients that checkout files from central place.

#### disadvantage
+ 单点故障
	+ if the server goes down for an hour,then during the that our nobody can collaborate at all or save versioned changes to anything they're working on.
	+ if the hard disk the central databases is on become corrupted,and proper backups haven't been kept,you lose absolutely everyting.except files on your local machine.

#### advantage
+ many people can collaborate,everyone can see changes that others maked.

### Distibuted Version Control Systems(DVCSs)

+ clients fully mirror the repository,including full history.Thus if any server dies,and these systems were collaborating via that server, any of the client repositories can be copied back up the server to restore it.Every clone is really a full backup of all the data.

+ many of these systems deal pretty well with having several remote repositories they can work with,so you can collaborate with different groups of people in different ways simultaneoursly within the same project.

a short history of Git
======================
between 1991-2002 ,team members of Linux kernal,changes to the software were passed around as patches and archived files.
2002, the linux project begin to use a DVCSs called BitKeeper.
2005, BitKeeper was not free-of-charge.this prompted the community to develop their own DVCSs tools.

git basics
==========

## snapshots, not differences
### other VCSs store changes of files when committed. It is like a list of changes.
### Git store snapshot of files  when committed. It is like a list of snapshots.
#### if file have no change, Git don't store it again,only store a reference of it.

## Nearly every Operation is Local
### you have entire history of the project on local disk.so nearly every operation is instantaneous.

 
