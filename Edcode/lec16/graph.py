import numpy as np
import matplotlib.pyplot as plt
import prettyplotlib as ppl

maxN = 5000;
N = np.linspace(0, maxN, 100)

RN = 2*N + 1

def f(N):
	return N

k1 = 1.5
k2 = 2.5

front = {'family': 'normal',
		 'weight': 'bold',
		 'size': 22}

plt.rc('font', **front)

k1f = f(N) * k1
k2f = f(N) * k2

plt.plot(N, k1f, '--',linewidth = 5)
plt.plot(N, RN, linewidth = 5)
plt.plot(N, k2f, '--', linewidth= 5)

plt.legend(['k1f(N)','R(N)','k2f(N)'])
plt.show()