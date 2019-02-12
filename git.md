about version control
=====================

version control is a system that records changes to a file(any type of file) or a set of filesover time so that you can recall specific versions later.

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
