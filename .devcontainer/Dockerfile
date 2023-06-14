FROM ghcr.io/smkwlab/atcoder-java-container:latest

#ARG DEBIAN_FRONTEND=noninteractive
## AtCoder 参加用プログラミング言語をインストール
#RUN apt-get update && \
#    apt-get install -y --no-install-recommends \
##            gcc-9 g++-9 \
##            openjdk-8-jdk-headless \
##            pypy3 \
##            ruby \
#            && \
#    apt-get clean && \
#    apt-get autoremove -y && \
#    rm -rf /var/lib/apt/lists/*


## バージョン番号非依存のコマンド名を設定
#RUN \
##    update-alternatives --install /usr/bin/gcc gcc /usr/bin/gcc-9 30 && \
##    update-alternatives --install /usr/bin/g++ g++ /usr/bin/g++-9 30 && \
##    update-alternatives --install /usr/bin/pypy pypy /usr/bin/pypy3 30 && \

## AtCoderでも使えるPythonライブラリをインストール
#RUN pip install numpy==1.18.2 && \
#    pip install scipy==1.4.1 && \
#    pip install scikit-learn==0.22.2.post1 && \
#    pip install numba==0.48.0 && \
#    pip install networkx==2.4

## Pythonでの競技プログラミング用データ構造をインストール
#RUN pip install git+https://github.com/hinamimi/ac-library-python && \
#    pip install git+https://github.com/hinamimi/python-sortedcontainers

## C++でAtCoder Library(ACL)を使えるようにする
#RUN git clone https://github.com/atcoder/ac-library.git /lib/ac-library
#ENV CPLUS_INCLUDE_PATH /lib/ac-library

## # AHC用のRustのinstall
#RUN curl https://sh.rustup.rs -sSf | sh -s -- -y
#ENV PATH $PATH:/home/root/.cargo/bin
