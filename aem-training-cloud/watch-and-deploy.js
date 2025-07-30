const { exec } = require('child_process');
const path = require('path');

function buildAndDeploy() {
  console.log('🔄 Detected changes. Building project...');

  const mvn = exec('mvn clean install -PautoInstallSinglePackage');

  mvn.stdout.on('data', (data) => {
    process.stdout.write(data);
  });

  mvn.stderr.on('data', (data) => {
    process.stderr.write(data);
  });

  mvn.on('exit', (code) => {
    if (code === 0) {
      console.log('✅ Build and deployment successful!');
    } else {
      console.log(`❌ Build failed with exit code ${code}`);
    }
  });
}

buildAndDeploy();
