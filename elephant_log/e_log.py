import time
import random
import json

aj = 'Ajingbaobao'
pig = 'foolishpig'
minw = 'minwiki7456'
frog = 'wallaceplayfrog'

rule = {}
rule['easy'] = [random.randint(10, 15)]
rule['normal'] = [random.randint(5, 10)]
rule['hard'] = [random.randint(0, 5)]

start_time = time.ctime()

jsonpath = '/home/yanglin/桌面/contruct_elephant/elephant_log/bill.json'
logpath = '/home/yanglin/桌面/contruct_elephant/elephant_log/elephant.log'
with open(jsonpath, 'r', encoding="utf-8") as f:
    d = json.loads(f.read())
f.close()

flag = '2333'
while flag != 65535:
    print('#################\n全部完成输入0\n未完成输入1\n补交输入2\n查看当前bill输入3\n退出输入65535\n#################')
    flag = int(input('>'))
    if flag == 0:
        with open(logpath, 'a', encoding="utf-8") as log_file:
            log_file.write('Program run at:{}\t今天全部完成\n'.format(start_time))
        log_file.close()
    elif flag == 1:
        print('输入未完成人人数')
        num = int(input('>'))    
        with open(logpath, 'a', encoding="utf-8") as log_file:
            log_file.write('Program run at:{0}\t未完成人数:{1}\n\t未完成人id：'.format(start_time, num))
            i = 0
            while i < num:
                print('输入未完成人id')
                for key in d.keys():
                    print(key)
                name = input('>')
                log_file.write('{}\t难易程度：'.format(name))
                print('输入难易程度')
                for key in rule.keys():
                    print(key)
                level = input('>')
                log_file.write('{0}\trandom value：{1}\n'.format(level, str(rule[level])))
                d[name] += rule[level]
                i += 1
        log_file.close()
    elif flag == 2:
        print('输入补交人数')
        num = int(input('>'))
        with open(logpath, 'a', encoding="utf-8") as log_file:
            log_file.write('\t补交人数:{}\n\t\t补交人id：'.format(num))
            i = 0
            while i < num:
                print('输入补交人id')
                for key in d.keys():
                    print(key)
                name = input('>')
                a = d[name].pop()
                log_file.write('{0}\trandom list pop value:{1}\n'.format(name, str(a)))
                i += 1
    elif flag == 3:
        print(json.dumps(d, indent=4))

with open(jsonpath, 'w', encoding="utf-8") as f:
    f.write(json.dumps(d, indent=4))
f.close()
