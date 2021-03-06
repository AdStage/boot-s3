# boot-s3

[![Dependencies Status](https://jarkeeper.com/adstage/boot-s3/status.svg)](https://jarkeeper.com/adstage/boot-s3)
[![Downloads](https://jarkeeper.com/adstage/boot-s3/downloads.svg)](https://jarkeeper.com/adstage/boot-s3)

[Boot](http://boot-clj.com/) task to sync local directory with AWS S3.
Most of the code borrowed from [lein-s3-sync](https://github.com/kanej/lein-s3-sync).
This task works in the efficient way and uploads only new or changed files to the s3.

## Install

For stable release, try:
```
[io.adstage/boot-s3 "0.1.2"]
```

For latest changes, try:
```
[io.adstage/boot-s3 "0.1.3-SNAPSHOT"]
```

## Usage

Add library
```
(require '[adstage.boot-s3 :refer :all])
```
and use it:

```
boot s3-sync -h
Sync local directory to AWS S3

Options:
  -h, --help                   Print this help info.
  -s, --source PATH            PATH sets subdirectory in :target-path to upload to s3.
  -b, --bucket BUCKET          BUCKET sets s3 bucket name.
  -a, --access-key ACCESS_KEY  ACCESS_KEY sets s3 access key.
  -k, --secret-key SECRET      SECRET sets s3 secret key.
  -m, --metadata META          Conj META onto a map with metadata to set on the objects, passed through to clj-aws-s3
  -p, --permissions PERMS      Conj PERMS onto a seq of 2-tuples of `[grantee permission]`, passed through to clj-aws-s3
  -f, --force                  Set to `true` to force upload of all objects
```

## Contributions

We love contributions. Please submit your pull requests.


## License

Copyright © 2013-2017 Adstage Ltd (eng@adstage.io).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).
