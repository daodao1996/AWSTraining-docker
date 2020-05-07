#FROM yarnpkg/node-yarn
FROM node:8
WORKDIR /page

COPY package.json /page
COPY yarn.lock /page

RUN yarn install

COPY . .

EXPOSE 1234

#CMD ["yarn","install"]

