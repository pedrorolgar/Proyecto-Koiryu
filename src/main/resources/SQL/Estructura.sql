CREATE TABLE usuarios (
  userid            INT AUTO_INCREMENT PRIMARY KEY,
  nombreusuario     VARCHAR(50)  NOT NULL,
  numerotelefono    VARCHAR(15)  NULL,
  correoelectronico VARCHAR(100) NOT NULL,
  genero            VARCHAR(20)  NULL,
  localidad         VARCHAR(50)  NULL,
  descripcion       TEXT         NULL,
  contraseña        VARCHAR(255) NOT NULL,
  CONSTRAINT nombreusuario UNIQUE (nombreusuario, correoelectronico)
);

CREATE TABLE citas (
  citaid               INT AUTO_INCREMENT PRIMARY KEY,
  usuariosolicitanteid INT NULL,
  usuariodestinoid     INT NULL,
  CONSTRAINT citas_ibfk_1 FOREIGN KEY (usuariosolicitanteid) REFERENCES usuarios (userid),
  CONSTRAINT citas_ibfk_2 FOREIGN KEY (usuariodestinoid) REFERENCES usuarios (userid)
);

CREATE INDEX usuariodestinoid ON citas (usuariodestinoid);

CREATE INDEX usuariosolicitanteid ON citas (usuariosolicitanteid);

CREATE TABLE eventos (
  eventoid          INT AUTO_INCREMENT PRIMARY KEY,
  nombreevento      VARCHAR(100) NOT NULL,
  tipoevento        VARCHAR(50)  NULL,
  descripcionevento TEXT         NULL,
  creadorid         INT          NULL,
  CONSTRAINT eventos_ibfk_1 FOREIGN KEY (creadorid) REFERENCES usuarios (userid)
);

CREATE INDEX creadorid ON eventos (creadorid);

CREATE TABLE likescitas (
  likecitaid INT AUTO_INCREMENT PRIMARY KEY,
  usuarioid  INT NULL,
  citaid     INT NULL,
  CONSTRAINT likescitas_ibfk_1 FOREIGN KEY (usuarioid) REFERENCES usuarios (userid),
  CONSTRAINT likescitas_ibfk_2 FOREIGN KEY (citaid) REFERENCES citas (citaid)
);

CREATE INDEX citaid ON likescitas (citaid);

CREATE INDEX usuarioid ON likescitas (usuarioid);

CREATE TABLE likeseventos (
  likeeventoid INT AUTO_INCREMENT PRIMARY KEY,
  usuarioid    INT NULL,
  eventoid     INT NULL,
  CONSTRAINT likeseventos_ibfk_1 FOREIGN KEY (usuarioid) REFERENCES usuarios (userid),
  CONSTRAINT likeseventos_ibfk_2 FOREIGN KEY (eventoid) REFERENCES eventos (eventoid)
);

CREATE INDEX eventoid ON likeseventos (eventoid);

CREATE INDEX usuarioid ON likeseventos (usuarioid);

CREATE TABLE participanteseventos (
  participanteeventoid INT AUTO_INCREMENT PRIMARY KEY,
  usuarioid            INT NULL,
  eventoid             INT NULL,
  CONSTRAINT participanteseventos_ibfk_1 FOREIGN KEY (usuarioid) REFERENCES usuarios (userid),
  CONSTRAINT participanteseventos_ibfk_2 FOREIGN KEY (eventoid) REFERENCES eventos (eventoid)
);

CREATE INDEX eventoid ON participanteseventos (eventoid);

CREATE INDEX usuarioid ON participanteseventos (usuarioid);

