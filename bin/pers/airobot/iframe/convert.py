#coding:utf-8

import os

for d in os.listdir('.'):
    if '.java' in d:
        with open(d,'r') as f:
            source = f.read()
        with open(d,'w') as f:
            f.write(source.decode('gbk').encode('utf-8'))
